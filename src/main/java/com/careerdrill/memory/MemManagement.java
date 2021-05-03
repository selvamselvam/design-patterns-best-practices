package com.careerdrill.memory;

import java.util.ArrayList;
import java.util.List;

public class MemManagement {
    public static void main(String[] args) {

        Runtime runTime = Runtime.getRuntime();
        long availableBytes = runTime.freeMemory();
        System.out.println("Available Memory:" + availableBytes);

        List<Customer> customerList = new ArrayList<>();

        for(int i=0;i<10000;i++) {
            customerList.add(new Customer("John"));
        }

        availableBytes = runTime.freeMemory();
        System.out.println("Available Memory:" + availableBytes);

        int noOfPrcoessor = runTime.availableProcessors();
        System.out.println("Number of Processors:" + noOfPrcoessor);


    }
}
