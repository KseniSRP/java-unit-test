import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Класс для тестирования метода проверки совершеннолетия.
 */
public class CheckIsAdultTests {

    /**
     * Тест проверяет, что метод checkIsAdult возвращает true для возраста 19 лет.
     */
    @Test
    public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
    }

    /**
     * Тест проверяет, что метод checkIsAdult возвращает false для возраста 17 лет.
     */
    @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        assertEquals("Ошибка: пользователь несовершеннолетний", false, isAdult);
    }

    /**
     * Тест проверяет, что метод checkIsAdult возвращает true для возраста 18 лет.
     */
    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        assertEquals("Должно вернуться true, так как пользователю ровно 18 лет", true, isAdult);
    }
}
