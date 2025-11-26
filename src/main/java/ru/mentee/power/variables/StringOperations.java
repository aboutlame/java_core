package ru.mentee.power.variables;

public class StringOperations {
    public static void main(String[] args) {
        String a = "YO";
        String b = "OY";
        int c = 1000;
        int cc = 1000;
        String ccc = "1000";
        char d = 'D';

        System.out.println("Конкатенация: " +  a + " + " +  b + " = " + a + b);
        System.out.println("Символ в строку: " +  "\'" + d +  "\'" + " -> " +  "\"" + Character.toString(d) +  "\"" + " " + Character.toString(d).getClass());
        System.out.println("Переводы из числа в строку: " + "fff" + String.valueOf(c) + Integer.toString(cc));
        System.out.println("Перевод из строки в число: " + 100 + Integer.parseInt(ccc));
        System.out.println("Java" + " -> " + "Java".charAt(0));
    }
}
