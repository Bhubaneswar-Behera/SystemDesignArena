package com.lld.concurrency.webscrapper;

import java.util.concurrent.Callable;

public class ScrapUrl implements Callable {
    private String url;

    public ScrapUrl(String url) {
        this.url = url;
    }

    @Override
    public Object call() throws Exception {
        System.out.println("Scrapping website: " + url);
        Thread.sleep(500);
        return null;
    }
}
