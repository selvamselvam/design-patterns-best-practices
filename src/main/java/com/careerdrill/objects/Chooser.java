package com.careerdrill.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Chooser<T> {
    private final List<T> choosers;


    public Chooser(List<T> choosers) {
        this.choosers = new ArrayList<>(choosers);
    }

    public T choose(){
        Random r = ThreadLocalRandom.current();
        return choosers.get(r.nextInt(choosers.size()));
    }

}
