package com.lld.producer.consumer;

import java.util.concurrent.Semaphore;
// Producer class that implements Runnable to produce items in a store
public class Producer implements Runnable {
    private Store store;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Producer(Store store, Semaphore producerSemaphore,Semaphore consumerSemaphore){
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            //synchronized (store) { //old way
            try {
                producerSemaphore.acquire();
                if (store.getItems().size() < store.getMaxSize()) {
                    store.addItem(new Object());
                }
                consumerSemaphore.release();
                // }
            }
            catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }
    }
}
