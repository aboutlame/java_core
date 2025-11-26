package ru.mentee.power.variables;

public class First {
    final static int myAge = 19;
    final static String myName = "Дима";

    public static String getMessage(){
        return "Меня зовут " + myName + ", мне " + myAge + " лет.";
    }
    public static void main(String[] args) {
        System.out.println(getMessage());
    }
}
