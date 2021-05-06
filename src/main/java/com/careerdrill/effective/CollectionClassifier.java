package com.careerdrill.effective;

import java.util.*;

public class CollectionClassifier {

    private static String print(Set<?> set){
        return "Set";
    }

    private static String print(List<?> list){
        return "List";
    }

    private static String print(Collection<?> map){
        return "Unknown Collection";
    }


    private static String classify(Collection<?> c){
        if(c instanceof  Set){
            return "Set";
        }else if(c instanceof List){
            return "List";
        }else{
            return "Unknown Collection";
        }

    }

    public static void main(String[] args) {
        Collection<?> []collections = {new HashSet<>(), new ArrayList<>(), new HashMap<String,String>().values()};


        for(Collection<?> c: collections){
            System.out.println(print(c));
        }

        System.out.println("\nProper usage");
        for(Collection<?> c: collections){
            System.out.println(classify(c));
        }


    }
}
