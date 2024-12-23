package ru.Pshenichnikova.task2;
// ElementType используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.ElementType;
// Retention используется для указания времени жизни аннотации (например, RUNTIME, CLASS, SOURCE)
import java.lang.annotation.Retention;
// RetentionPolicy определяет политики удержания аннотаций
import java.lang.annotation.RetentionPolicy;
// Target используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.Target;

// Объявление пользовательской аннотации @Validate
// Аннотация будет доступна во время выполнения программы (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)

// Аннотация может быть применена к типам (классам) и другим аннотациям (ElementType.TYPE, ElementType.ANNOTATION_TYPE)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})

// Объявление интерфейса аннотации Validate
public @interface Validate {

    // Объявление метода value, который возвращает массив объектов типа Class<?>
    // Этот метод используется для указания классов, связанных с аннотацией
    Class<?>[] value();
}
