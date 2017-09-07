package com.howtographql.hackernews;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Manages link persistence
 */
public class LinkRepository {

    private final ArrayList<Link> links = new ArrayList<>();

    public LinkRepository() {
      links.add(new Link("cafebabe", "test"));
    }

    public List<Link> getAllLinks() {
        return links;
    }

}
