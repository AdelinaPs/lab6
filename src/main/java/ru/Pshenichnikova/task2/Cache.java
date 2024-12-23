package ru.Pshenichnikova.task2;
// ElementType используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.ElementType;
// Retention используется для указания времени жизни аннотации (например, RUNTIME, CLASS, SOURCE)
import java.lang.annotation.Retention;
// RetentionPolicy определяет политики удержания аннотаций
import java.lang.annotation.RetentionPolicy;
// Target используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.Target;

// Объявление пользовательской аннотации @Cache
// Аннотация будет доступна во время выполнения программы (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)

// Аннотация может быть применена к типам (классам) (ElementType.TYPE)
@Target(ElementType.TYPE)

// Объявление интерфейса аннотации Cache
public @interface Cache {

    // Объявление метода value, который возвращает массив строк
    // Этот метод используется для указания значений аннотации
    // По умолчанию метод возвращает пустой массив строк
    String[] value() default {};
}
