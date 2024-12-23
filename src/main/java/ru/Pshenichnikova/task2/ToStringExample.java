package ru.Pshenichnikova.task2;

// Объявление публичного класса ToStringExample
public class ToStringExample {

    // Объявление приватного поля name типа String
    // Поле аннотировано пользовательской аннотацией @ToString с значением по умолчанию (Value.YES)
    @ToString
    private String name;

    // Объявление приватного поля age типа int
    // Поле аннотировано пользовательской аннотацией @ToString с параметром value, указывающим на Value.NO
    @ToString(value = ToString.Value.NO)
    private int age;
}
