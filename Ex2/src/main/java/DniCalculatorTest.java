import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniCalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, T",
            "44444444, M",
            "55555555, C",
            "66666666, Y",
            "77777777, B",
            "88888888, F"
    })
    void testDniLetterCalculation(int dniNumber, char expectedLetter) {
        assertEquals(expectedLetter, DniCalculator.calculateLetter(dniNumber));
    }
}