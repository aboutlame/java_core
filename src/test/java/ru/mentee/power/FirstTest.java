package ru.mentee.power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTest {
    @Test
    void First(){
        assertEquals("Меня зовут Дима, мне 19 лет.", First.getMessage());
    }
}