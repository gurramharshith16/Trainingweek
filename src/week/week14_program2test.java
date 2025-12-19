package week;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class week14_program2test {
    week14_program2 checker = new week14_program2();

    @Test
    void testPalindromeTrue() {
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    void testPalindromeFalse() {
        assertFalse(checker.isPalindrome("hello"));
    }
}
