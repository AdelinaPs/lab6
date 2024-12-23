package ru.Pshenichnikova.task2;

// Объявление публичного класса DefaultExample
public class DefaultExample {

    // Объявление приватного поля name типа String
    private String name;

    // Объявление приватного поля age типа int
    // Поле аннотировано пользовательской аннотацией @Default с параметром value, указывающим на класс DefaultExample
    @Default(value = DefaultExample.class)
    private int age;
}
