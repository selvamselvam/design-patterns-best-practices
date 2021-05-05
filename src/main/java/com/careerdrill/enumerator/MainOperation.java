package com.careerdrill.enumerator;

public class MainOperation {
    public static void main(String[] args) {
        double x = Double.parseDouble("5");
        double y = Double.parseDouble("2");
        test(ExtendedOperation.class, x, y);
    }
    private static <T extends Enum<T> & Operation> void test(
            Class<T> opEnumType, double x, double y) {
        for (Operation op : opEnumType.getEnumConstants())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
