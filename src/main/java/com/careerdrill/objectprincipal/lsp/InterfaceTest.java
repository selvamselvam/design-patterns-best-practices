package com.careerdrill.objectprincipal.lsp;

public interface InterfaceTest {

    void displayWords();

     static void display(){
        System.out.println("Display inside interface");
    }

    default void overrideDisplay(){
        System.out.println("Default implementation");
    }
}
