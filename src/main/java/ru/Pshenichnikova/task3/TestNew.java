package ru.Pshenichnikova.task3;

import ru.Pshenichnikova.task2.ToString;

// Объявление публичного класса TestNew, который наследуется от абстрактного класса EntityNew
public class TestNew extends EntityNew {

    // Объявление приватного поля name типа String с начальным значением "Test"
    // Поле аннотировано пользовательской аннотацией @ToString с параметром value, указывающим на ToString.Value.NO
    @ToString(ToString.Value.NO)
    private String name = "Test";

    // Объявление поля x типа int с начальным значением 5
    int x = 5;
}

