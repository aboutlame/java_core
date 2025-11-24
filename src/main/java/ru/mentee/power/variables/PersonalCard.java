package ru.mentee.power.variables;

public class PersonalCard {
    public static void main(String[] args) {
        String name = "Dima";
        String lastName = "Timoshenko";
        String city = "Moscow";
        int age = 19;
        int height = 181;
        int weight = 65;
        boolean isStudent = true;
        char firstNameLetter = 'D';

        System.out.println("===== ЛИЧНАЯ КАРТОЧКА =====");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Город: " + city);
        System.out.println("Рост: " + height + " см");
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Студент: " + isStudent);
        System.out.println("Первая буква имени: " + firstNameLetter);
        System.out.println("==========================");
    }
}
