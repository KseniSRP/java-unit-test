import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Класс для тестирования метода проверки совершеннолетия.
 */
public class CheckIsAdultTests {

    /**
     * Тест проверяет, что метод checkIsAdult возвращает true для возраста 19 лет.
     * Сообщение об ошибке добавлено понимания причин неудачи теста.
     */
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        boolean isExpected = true;
        assertEquals("Не 18 лет: ожидалось true, получено " + isAdult, isExpected, isAdult);
    }
}
