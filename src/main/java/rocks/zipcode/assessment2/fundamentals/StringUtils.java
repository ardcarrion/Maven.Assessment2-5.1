package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder padded = new StringBuilder(stringToBePadded);
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) padded.insert(0, " ");
        return padded.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder padded = new StringBuilder(stringToBePadded);
        for (int i = 0; i < amountOfPadding - stringToBePadded.length(); i++) padded.insert(stringToBePadded.length(), " ");
        return padded.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++) repeated.append(stringToBeRepeated);
        return repeated.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        char[] chars = string.toLowerCase().toCharArray();
        for (char c : chars) {
            if ((c < 97 | c > 122) && c != 32) return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char[] chars = string.toCharArray();
        for (char c : chars) if (!(c >= 48 && c <= 57)) return false;
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        char[] chars = string.toCharArray();
        for (char c : chars) {
            String letter = String.valueOf(c);
            if (isAlphaString(letter) | isNumericString(letter)) return false;
        }
        return true;
    }
}
