package ru.mentee.power.variables;

public class ConstantsAndScope {
    public static final int FINAL_1 = 10;
    public static final int FINAL_2 = 100;

    public static void main(String[] args) {
        String local = "local";
        System.out.println(FINAL_1 + " - в main константа класса");
        System.out.println(someMethod(4));

        {
            int block = 20;
            final String BLOCK_CONST = "что-то";

            System.out.println("Внутри блока:");
            System.out.println(block + " и " + BLOCK_CONST + " - локальные переменные");
            System.out.println(FINAL_1 + " - в отдельном блоке константа класса");
            // System.out.println(b);  локальная переменная другого метода
        }
        // System.out.println(block); локальная переменная вне области видимости
    }

    public static int someMethod(int a) {
        int b = 1;
        System.out.println(FINAL_2+ " - в методе константа класса"); // выведется
        // System.out.println(local); не выведется
        return a+=b;
    }
}
