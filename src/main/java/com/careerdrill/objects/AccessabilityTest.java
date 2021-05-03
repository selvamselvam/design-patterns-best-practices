package com.careerdrill.objects;

import java.util.List;

public class AccessabilityTest {


    //Do not do this
    private  static final Integer[] PRIVATE_VALUES = {1,2,3,4,5,6};

    // Best practice
    public static final List<Integer> PRIVATE_LIST = List.of(PRIVATE_VALUES);


    public static void main(String[] args) {
        PRIVATE_LIST.forEach(System.out::println);



    }
}
