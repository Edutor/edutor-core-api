package com.howtographql.hackernews;

/**
 * Data-class representing a link
 */
public class Link {

    public final String id;
    public final String url;

    public Link(String id, String url) {
        this.id = id;
        this.url = url;
    }

    public String getId() {
      return id;
    }

    public String getUrl() {
      return url;
    }

}
