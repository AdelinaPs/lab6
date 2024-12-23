package ru.Pshenichnikova.task2;

// Объявление публичного класса InvokeExample
public class InvokeExample {

    // Объявление публичного метода test, который возвращает строку "test"
    // Метод аннотирован пользовательской аннотацией @Invoke
    @Invoke
    public String test() {
        // Возврат строки "test"
        return "test";
    }
}
