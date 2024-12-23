package ru.Pshenichnikova.task4;

import org.junit.jupiter.api.Test;
import ru.Pshenichnikova.task3.TestNew;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToStringTest {

    /*
    Тесты для метода toString класса TestNew
    В классе TestNew есть поле x, которое аннотировано как ToString.Value.YES,
    поэтому оно выводится в toString
    Также в классе TestNew есть поле y, которое аннотировано как ToString.Value.NO,
    поэтому оно не выводится в toString
    @ToString.Value.YES - выводится в toString
    @ToString.Value.NO - не выводится в toString
     */

    @Test
    public void testToString() {
        // Создаем объект класса TestNew
        TestNew test = new TestNew();
        // Вручную вводим ожиданий вывод
        String expectedOutput = "TestNew{x=5}";
        // Получаем вывод метода toString
        String actualOutput = test.toString();
        // Сравниваем ожидаемый и полученный вывод
        assertEquals(expectedOutput, actualOutput);
    }
}
