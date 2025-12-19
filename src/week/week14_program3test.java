package week;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class week14_program3test {
    week14_program3 calculator = new week14_program3();

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
