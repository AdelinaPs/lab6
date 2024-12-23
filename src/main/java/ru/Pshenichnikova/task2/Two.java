package ru.Pshenichnikova.task2;
// ElementType используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.ElementType;
// Retention используется для указания времени жизни аннотации (например, RUNTIME, CLASS, SOURCE)
import java.lang.annotation.Retention;
// RetentionPolicy определяет политики удержания аннотаций
import java.lang.annotation.RetentionPolicy;
// Target используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.Target;

// Объявление пользовательской аннотации @Two
// Аннотация будет доступна во время выполнения программы (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)

// Аннотация может быть применена к типам (классам) (ElementType.TYPE)
@Target(ElementType.TYPE)

// Объявление интерфейса аннотации Two
public @interface Two {

    // Объявление метода first, который возвращает строку
    // Этот метод используется для указания первого значения аннотации
    String first();

    // Объявление метода second, который возвращает целое число
    // Этот метод используется для указания второго значения аннотации
    int second();
}
