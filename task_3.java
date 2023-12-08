import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

/**
 * Класс для параметризованных тестов метода проверки совершеннолетия.
 */
@RunWith(Parameterized.class)
public class CheckIsAdultTest {
  
    // Поля для хранения входных данных и ожидаемого результата
    private final int age;
    private final boolean result;

    /**
     * Конструктор, инициализирующий поля класса теста.
     * @param age Возраст для проверки
     * @param result Ожидаемый результат проверки
     */
    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    /**
     * Предоставляет набор тестовых данных.
     * @return Коллекция тестовых данных и ожидаемых результатов
     */
    @Parameterized.Parameters
    public static Collection<Object[]> getTextData() {
        return Arrays.asList(new Object[][] {
            {18, true},   // Совершеннолетний в странах с 18-летним порогом
            {17, false},  // Несовершеннолетний во всех странах
            {21, true},   // Совершеннолетний во всех странах
            {20, true}    // Совершеннолетний в странах с 18-летним порогом
        });
    }

    /**
     * Тест проверяет, соответствует ли возраст критерию совершеннолетия.
     */
    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Тест провалился для возраста: " + age, result, isAdult);
    }
}
