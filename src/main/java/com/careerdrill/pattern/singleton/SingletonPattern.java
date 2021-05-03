package com.careerdrill.pattern.singleton;

import java.util.Objects;

public class SingletonPattern {

    private static SingletonPattern singletonPattern = null;

    private SingletonPattern() {
        // Provide constructor
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static SingletonPattern getInstance() {

        synchronized (SingletonPattern.class) {
            if (Objects.isNull(singletonPattern)) {
                singletonPattern = new SingletonPattern();
            }
        }
        return singletonPattern;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        SingletonPattern singleton = SingletonPattern.getInstance();
        System.out.println(singleton.toString());
        SingletonPattern singleton2 = SingletonPattern.getInstance();
        System.out.println(singleton2.toString());

        if (singleton.equals(singleton2)) {
            System.out.println("Confirm singleton object using equals ");
        }

        if (singleton == singleton2) {
            System.out.println("Confirm singleton object using Reference ");
        }


    }
}
