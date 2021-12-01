package verifier;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerifierForEx2 {

    public static boolean isConvertibleToNumber(String in) {
        Pattern pattern = Pattern.compile("^-?\\d+$");
        Matcher matcher = pattern.matcher(in);
        return matcher.find();
    }

    public static boolean isConvertibleToNumberWithComma(String in) {
        Pattern pattern = Pattern.compile("^-?[1-9]\\d+(,\\d+)?$");
        Matcher matcher = pattern.matcher(in);
        return matcher.find();
    }
}
