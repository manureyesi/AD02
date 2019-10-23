/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rss.elPais;

public class Item
{
    private String comments;

    private Enclosure[] enclosure;

    private String link;

    private Guid guid;

    private String description;

    private String title;

    private String[] category;

    private String pubDate;

    public String getComments ()
    {
        return comments;
    }

    public void setComments (String comments)
    {
        this.comments = comments;
    }

    public Enclosure[] getEnclosure ()
    {
        return enclosure;
    }

    public void setEnclosure (Enclosure[] enclosure)
    {
        this.enclosure = enclosure;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public Guid getGuid ()
    {
        return guid;
    }

    public void setGuid (Guid guid)
    {
        this.guid = guid;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String[] getCategory ()
    {
        return category;
    }

    public void setCategory (String[] category)
    {
        this.category = category;
    }

    public String getPubDate ()
    {
        return pubDate;
    }

    public void setPubDate (String pubDate)
    {
        this.pubDate = pubDate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [comments = "+comments+", enclosure = "+enclosure+", link = "+link+", guid = "+guid+", description = "+description+", title = "+title+", category = "+category+", pubDate = "+pubDate+"]";
    }
}
