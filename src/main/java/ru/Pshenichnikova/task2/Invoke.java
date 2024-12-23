package ru.Pshenichnikova.task2;

// ElementType используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.ElementType;
// Retention используется для указания времени жизни аннотации (например, RUNTIME, CLASS, SOURCE)
import java.lang.annotation.Retention;
// RetentionPolicy определяет политики удержания аннотаций
import java.lang.annotation.RetentionPolicy;
// Target используется для указания типов элементов, к которым может быть применена аннотация
import java.lang.annotation.Target;


// Объявление пользовательской аннотации @Invoke
// Аннотация будет доступна во время выполнения программы (RUNTIME)
@Retention(RetentionPolicy.RUNTIME)

// Аннотация может быть применена только к методам (ElementType.METHOD)
@Target(ElementType.METHOD)

// Объявление интерфейса аннотации Invoke
public @interface Invoke {
    // Тело аннотации пустое, так как она не принимает никаких параметров
}

