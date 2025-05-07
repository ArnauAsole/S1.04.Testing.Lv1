public class DniCalculator {
    private static final char[] LETTERS = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
            'C', 'K', 'E'
    };

    public static char calculateLetter(int dniNumber) {
        if (dniNumber < 0 || dniNumber > 99999999) {
            throw new IllegalArgumentException("DNI number must be between 0 and 99,999,999");
        }
        return LETTERS[dniNumber % 23];
    }

    public static boolean isValidDniFormat(String dniInput) {
        return dniInput != null && dniInput.matches("\\d{8}");
    }

    public static char calculateLetter(String dniInput) {
        if (!isValidDniFormat(dniInput)) {
            throw new IllegalArgumentException("DNI must have exactly 8 digits (e.g., 01234567)");
        }
        int dniNumber = Integer.parseInt(dniInput);
        return calculateLetter(dniNumber); // reutiliza el método existente
    }
}
