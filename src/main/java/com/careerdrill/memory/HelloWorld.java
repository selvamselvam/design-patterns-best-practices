package com.careerdrill.memory;

import com.careerdrill.memory.Customer;

public class HelloWorld {

    void changeValue(Customer c){
        c.setName("Selvi");
    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        int i=5;
        int j = 6;
        int k= i * j;

        System.out.println("Addition of i and j:" + k);

        Customer c = new Customer("siva");
        c.setAge(33);
        System.out.println(c.getName());
        System.out.println();
        "Hello world!".chars().forEach(System.out::print);

    }
}
