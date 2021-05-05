package com.careerdrill.objects.serialization;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

public class SerializationProxy implements Serializable {
    private final Date start;
    private final Date end;

    SerializationProxy(Period p) {
        this.start = p.start();
        this.end = p.end();
    }
    private static final long serialVersionUID =
            234098243823485285L; // Any number will do (Item 87)

    Period p;

    // writeReplace method for the serialization proxy pattern
    private Object writeReplace() {
        return new SerializationProxy(p);
    }

    // readObject method for the serialization proxy pattern
    private void readObject(ObjectInputStream stream)
            throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }

}

