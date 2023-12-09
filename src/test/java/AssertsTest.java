import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertsTest {

    @Test
    @Order(2)
    @DisplayName("Test: String Equals - Negative")
    void assertionEqualsNegative(){
        assertEquals("cat", "dog", "Strings are not equal");
    }

    @Test
    @Order(1)
    @DisplayName("Test: String Equals - Positive")
    void assertionEqualsPositive(){
        assertEquals("cat", "cat", "Strings are not equal");
    }

    @Test
    @Order(3)
    @DisplayName("Test: List Equals")
    void assertionEqualsList(){
        List<String> expected = Arrays.asList("cat", "dog", "mouse");
        List<String> actual = Arrays.asList("cat", "dog", "mouse");
        assertEquals(expected, actual, "Lists are not equal");
    }

    @Test
    @Order(4)
    @DisplayName("Test: Assert True")
    void assertionTrue(){
        String str1 = new String("AAA");
        String str2 = new String("AAA");
        assertTrue(str1.equals(str2));
    }

    @Test
    @Order(5)
    @DisplayName("Test: Assert False")
    void assertionFalse(){
        String str1 = new String("AAA");
        String str2 = new String("AAA");
        assertFalse(str1 == str2);
    }

    @Test
    @Order(6)
    @DisplayName("Test: All Asserts")
    void assertionAll() {
        String str1 = new String("AAA");
        String str2 = new String("AAA");
        String str3 = "BBB";
        assertAll(
                () -> assertTrue(str1.equals(str2)),
                () -> assertFalse(str1 == str2),
                () -> assertNotSame(str1, str3)
        );
    }
}
