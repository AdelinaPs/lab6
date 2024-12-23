package ru.Pshenichnikova.task1;

import java.lang.reflect.Field;
import java.util.Arrays;

// Объявление абстрактного класса Entity
public abstract class Entity {
    // Переопределение метода toString для представления объекта в виде строки
    @Override
    public String toString() {
        // Создание объекта StringBuilder для построения строки
        StringBuilder result = new StringBuilder();

        // Добавление имени класса и открывающей фигурной скобки в строку
        result.append(this.getClass().getSimpleName()).append("{");
        // Получение массива всех полей текущего класса
        Field[] fields = this.getClass().getDeclaredFields();

        // Использование потока для установки доступности всех полей
        Arrays.stream(fields)
                .forEach(field -> field.setAccessible(true));
        // Использование потока для добавления значений полей в строку
        Arrays.stream(fields)
                .forEach(field -> {
                    try {
                        // Добавление имени поля и его значения в строку
                        result.append(field.getName()).append("=").append(field.get(this)).append(", ");
                    } catch (IllegalAccessException e) {
                        // Обработка исключения, если доступ к полю запрещен
                        e.printStackTrace();
                    }
                });

        // Если есть хотя бы одно поле, удаление последней запятой и пробела
        if (fields.length > 0) {
            result.setLength(result.length() - 2);
        }
        // Добавление закрывающей фигурной скобки в строку
        result.append("}");
        // Возврат построенной строки
        return result.toString();
    }
}
