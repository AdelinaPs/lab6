package ru.Pshenichnikova.task3;

import ru.Pshenichnikova.task2.ToString;

// Field используется для работы с полями класса через рефлексию
import java.lang.reflect.Field;
// Arrays предоставляет методы для работы с массивами
import java.util.Arrays;

// Объявление абстрактного публичного класса EntityNew
public abstract class EntityNew {

    // Переопределение метода toString для представления объекта в виде строки
    @Override
    public String toString() {
        // Создание объекта StringBuilder для построения строки
        StringBuilder result = new StringBuilder();

        // Добавление имени класса и открывающей фигурной скобки в строку
        result.append(this.getClass().getSimpleName()).append("{");

        // Получение аннотации @ToString для текущего класса
        ToString annotation = this.getClass().getAnnotation(ToString.class);

        // Проверка, аннотирован ли класс аннотацией @ToString с значением Value.NO
        boolean isAnnotatedWithValueNo = annotation != null && annotation.value() == ToString.Value.NO;

        // Получение массива всех полей текущего класса
        Field[] fields = this.getClass().getDeclaredFields();

        // Использование потока для установки доступности всех полей
        Arrays.stream(fields)
                .forEach(field -> field.setAccessible(true));

        // Использование потока для фильтрации и добавления значений полей в строку
        Arrays.stream(fields)
                .filter(field -> {
                    // Получение аннотации @ToString для текущего поля
                    ToString fieldAnnotation = field.getAnnotation(ToString.class);
                    // Фильтрация полей на основе аннотаций
                    return (fieldAnnotation == null && !isAnnotatedWithValueNo) ||
                            (fieldAnnotation != null && fieldAnnotation.value() == ToString.Value.YES);
                })
                .forEach(field -> {
                    try {
                        // Добавление имени поля и его значения в строку
                        result.append(field.getName()).append("=").append(field.get(this)).append(", ");
                    } catch (IllegalAccessException e) {
                        // Обработка исключения, если доступ к полю запрещен
                        e.printStackTrace();
                    }
                });

        // Если строка содержит больше символов, чем имя класса и две фигурные скобки, удаление последней запятой и пробела
        if (result.length() > this.getClass().getSimpleName().length() + 2) {
            result.setLength(result.length() - 2);
        }

        // Добавление закрывающей фигурной скобки в строку
        result.append("}");

        // Возврат построенной строки
        return result.toString();
    }
}

