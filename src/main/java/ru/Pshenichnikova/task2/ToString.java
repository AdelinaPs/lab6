package ru.Pshenichnikova.task2;

// ElementType используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.ElementType;
// Retention используется для указания времени жизни аннотации (например, RUNTIME, CLASS, SOURCE)
import java.lang.annotation.Retention;
// RetentionPolicy определяет политики удержания аннотаций
import java.lang.annotation.RetentionPolicy;
// Target используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.Target;

// Объявление пользовательской аннотации @ToString
// Аннотация будет доступна во время выполнения программы (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)

// Аннотация может быть применена к типам (классам) и полям (ElementType.TYPE, ElementType.FIELD)
@Target({ElementType.TYPE, ElementType.FIELD})

// Объявление интерфейса аннотации ToString
public @interface ToString {

    // Объявление метода value, который возвращает объект типа Value
    // Метод имеет значение по умолчанию Value.YES
    Value value() default Value.YES;

    // Объявление вложенного перечисления Value с константами YES и NO
    enum Value { YES, NO }
}
