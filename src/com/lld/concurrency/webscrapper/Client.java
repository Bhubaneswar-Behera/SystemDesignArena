package com.lld.concurrency.webscrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        List<String> urls = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            urls.add("https://example.com/page" + i);
        }

        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
        ExecutorService executorService2 = Executors.newCachedThreadPool();

        long startTime = System.currentTimeMillis();
        executeScraping(urls, executorService1);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with fixed thread pool: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        executeScraping(urls, executorService2);
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with cached thread pool: " + (endTime - startTime) + " ms");
    }

    public static void executeScraping(List<String> urls, ExecutorService executorService) {
        List<Future<Void>> futures = new ArrayList<>();

        for (String url : urls) {
           futures.add(executorService.submit(new ScrapUrl(url)));
        }

        for (Future<Void> future : futures) {
            try {
                future.get(); // Wait for the scraping to complete
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
