package com.careerdrill.effective;

import java.util.Date;
import java.util.Objects;

public final class Defencivecopy {


    private final Date start;
    private final Date end;

    public  Defencivecopy(Date start, Date end){

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);



    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Defencivecopy p = new Defencivecopy(start, end);
        //end.setYear(78); // Modifies internals of p!
        System.out.println("Start:"+p.getStart() + "<=> End:"+p.getEnd());
    }
}
