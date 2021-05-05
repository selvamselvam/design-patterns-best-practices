package com.careerdrill.memory;


import java.util.Arrays;
import java.util.EmptyStackException;

public class MemoeryLeakStack<E> {
    private E [] elements;
    private int size;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public MemoeryLeakStack(){
        elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e){
        ensureCapacity();
        elements[size++]=e;
    }

    public E pop(){
        if(size==0){
            throw new EmptyStackException();
        }
        @SuppressWarnings("unchecked")
        E result =  (E) elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public  void ensureCapacity(){
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    public static void main(String[] args) {
        MemoeryLeakStack<String> stack = new MemoeryLeakStack<>();
        stack.push("aa");
        stack.push("bb");
        stack.push("cc");
        while (!stack.isEmpty())
            System.out.println(stack.pop().toUpperCase());
    }
}
