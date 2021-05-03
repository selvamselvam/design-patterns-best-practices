package com.careerdrill.memory.thread;

public class ImpRunnable implements  Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ImpRunnable());
        thread.start();

    }
}
