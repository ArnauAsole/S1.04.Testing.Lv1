import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayTest {

    @Test
    void testArrayIndexOutOfBoundsExceptionIsThrown() {
        Array example = new Array();
        int[] numbers = {1, 2, 3};

        // Verify that accessing index 5 throws the expected exception
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            example.getElementAt(numbers, 9);
        });
    }
}
