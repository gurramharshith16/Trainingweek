package week;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class week14_program1test {

    week14_program1 calc = new week14_program1();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }
    @Test
    void testMultiply() {
        assertEquals(6, calc.multiply(2, 3));
    }
    @Test
    void testDivide() {
        assertEquals(2, calc.divide(4, 2));
    }
}
