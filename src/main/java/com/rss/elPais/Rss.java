/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rss.elPais;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.xml.sax.helpers.DefaultHandler;

@XmlRootElement
public class Rss extends DefaultHandler {
    private Channel channel;

    private String version;

    public Channel getChannel ()
    {
        return channel;
    }

    @XmlElement
    public void setChannel (Channel channel)
    {
        this.channel = channel;
    }

    public String getVersion ()
    {
        return version;
    }

    @XmlElement
    public void setVersion (String version)
    {
        this.version = version;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [channel = "+channel+", version = "+version+"]";
    }
}
