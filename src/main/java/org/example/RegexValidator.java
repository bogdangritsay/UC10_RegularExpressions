package org.example;

import java.util.regex.Pattern;

public class RegexValidator {
    private static final String SPECIAL_CHARACTERS = "\\Q!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\\E";


    /**
     *
     * @param str string for validationb
     * @param maxLength num
     * @return true if string validated successfully, fails if is not
     *
     * Regular Expression Explanation:
     * ^: Denotes the beginning of the line.
     * (?=.*[A-Z]): Positive lookahead for one uppercase letter.
     * (?=.*[a-z]): Positive lookahead for one lowercase letter.
     * (?=.*\d): Positive lookahead for one digit.
     * (?=.*[SPECIAL_CHARACTERS]): Positive lookahead for one special character from the predefined list.
     * (?!.*\s): Negative lookahead to ensure there's no whitespace character in the string.
     * .{1,PARAMETERIZED_LENGTH}$: Ensures the length of the string is between 1 and the given maximum length (inclusive).
     * $: Denotes the end of the line.
     * Caveats and Limitations:
     * The minimum valid string length is 4 since it needs at least one uppercase, one lowercase, one digit, and one special character.
     * The maximum valid string length is specified by the maxLength parameter.
     * The list of special characters is predefined and should not be changed without updating the regular expression accordingly.
     */
    public static boolean validateString(String str, int maxLength) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[" + SPECIAL_CHARACTERS + "])(?!.*\\s).{1," + maxLength + "}$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(str).matches();
    }

}