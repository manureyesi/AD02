/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rss.elPais;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * LeerRSSElPais
 */
public class LeerRSSElPais {
    
    private final static String URL_PORTADA_EL_PAIS = "https://elpais.com/rss/elpais/portada.xml";
    
    public static void leerPortadaElPais () {
        
        try {
            
            //Url Portada
            URL url = new URL(URL_PORTADA_EL_PAIS);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));

            JAXBContext jaxbContext = JAXBContext.newInstance(Rss.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Rss customer = (Rss) jaxbUnmarshaller.unmarshal(br);

            for (Item item : customer.getChannel().getItem()) {
                
                System.out.println("---------------------------------------------------------");
                System.out.println(item.getTitle());
                
                if (StringUtils.isNotBlank(item.getDescription())) {
                    System.out.println("Descripcion:");
                    System.out.println(item.getDescription());
                }
                
            }
            
        } catch (IOException | JAXBException e) {
            System.err.println("Error al leer Portada.");
        }
                
    }
    
}
