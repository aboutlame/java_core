package ru.mentee.power.datatypes;

public class DataTypes {

    public static void main(String[] args) {
        int a = 20;
        boolean b = true;
        long c = 1000_000_000_000L;
        short d = 100;
        char e = 'A';
        double f = 200.28;
        float g = 134.25f;
        byte h = 12;
        String i = "Строка";
        String j = "15";
        int[] k = {1,2,3,4};

        System.out.println("Преобразование в double: " + f + " (double)" + " / " + a + " (int)" + " = " + f / a);
        System.out.println("Преобразование в long: " + c + " (long)" + " + " + d + " (short)" + " = " + c + d);
        System.out.println("Преобразование в float: " + g + " (float)" + " * " + h + " (byte)" + " = " + g * h);
        System.out.println("Преобразование String -> int: " + a + " (int)" + " - " + j + " (String)" + " = " + (a - Integer.parseInt(j)));
        System.out.println("Преобразование в String: " + d + " (short)" + " + " + e  + " (char)" + " = " + Integer.toString(d) + e);
    }
}
