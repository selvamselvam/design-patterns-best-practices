package com.careerdrill.thread;

public class ThreadExtendClass extends  Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadExtendClass thread = new ThreadExtendClass();
        thread.start();



    }
}
