package ru.Pshenichnikova;

import ru.Pshenichnikova.task1.Test;
import ru.Pshenichnikova.task3.TestNew;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание 1");
        Test test = new Test();
        System.out.println(test);

        // Task 3
        System.out.println("Задание 2");
        System.out.println("Поле name аннотировано как ToString.Value.NO, поэтому оно не выводится в toString");
        TestNew testNew = new TestNew();
        System.out.println(testNew);
    }
}