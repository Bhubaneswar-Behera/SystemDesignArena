package com.lld.producer.consumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Consumer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        //while (true) {
        try{
            consumerSemaphore.acquire();
            if (store.getItems().size() < 0){
                store.removeItem();
            }
            producerSemaphore.release();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
