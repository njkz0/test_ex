package exercises;

import java.util.Arrays;

public class ReplacerEx1 {

    public static String replaceFirstChar(String in, char whatReplace, char replacement) {
        char[] charArray = in.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == whatReplace) {
                charArray[i] = replacement;
                return new String(charArray);
            }
        }
        return in;
    }

    public static String replaceAllChar(String in, char whatReplace, char replacement) {
        char[] charArray = in.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == whatReplace) {
                charArray[i] = replacement;
            }
        }
        return new String(charArray);
    }
}
