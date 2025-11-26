package ru.mentee.power.variables;

public class TypeCalculator {
    public static void main(String[] args) {
        byte a = 100;
        short b = 1000;
        int c = 50_000;
        long d = 50L;
        float e = 20.0f;
        double f = 30.0;

        System.out.println(String.format("(byte) %d + (int) %d = %d", a, c, a + c));
        System.out.println(String.format("(float) %.1f + (int) %d = %.1f", e, c, e + c));
        System.out.println(String.format("(double) %.1f + (int) %d = %.1f", f, c, f + c));
        System.out.println(String.format("(long) %d + (short) %d = %d", d, b, d + b));
    }
}

