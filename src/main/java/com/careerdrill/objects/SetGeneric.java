package com.careerdrill.objects;

import java.util.HashSet;
import java.util.Set;

public class SetGeneric {
    public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<String> stooges = Set.of("Larry", "Moe", "Curly");
        Set<String> all = union(guys,stooges);
        System.out.println(all);
    }
}
