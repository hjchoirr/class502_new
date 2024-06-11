package exam01;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

@Tag("exercise")

@DisplayName("테스트들...")
public class Ex01Test {
    @Test
    void test1() {
        Calculator cal = new Calculator();
        int num1 = 10, num2 = 20;
        int result = cal.add(num1, num2);

        assertEquals(30, result);
    }
    @Test
    @Disabled
    void test2() {
        LocalDate expected = LocalDate.now();
        LocalDate date = LocalDate.of(2024, 6, 5);
        assertEquals(expected, date); //동등성비교
        assertSame(expected, date);
    }
    @Test
    @Disabled
    void test3() {
        fail();
    }
    @DisplayName("테스트 4")
    @Test
    void test4() {

    }
    @DisplayName("테스트--5")
    @Test
    @Disabled
    void test5() {

    }
}
