package com.careerdrill.enumerator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorExample {
    public static void main(String[] args) {
        DoubleBinaryOperator op1= (a, b) -> a+b;
        DoubleBinaryOperator op2= (a, b) -> a-b;
        DoubleBinaryOperator op3= (a, b) -> a*b;
        DoubleBinaryOperator op4= (a, b) -> a/b;

        System.out.println(op1.applyAsDouble(12,12));


    }
}
