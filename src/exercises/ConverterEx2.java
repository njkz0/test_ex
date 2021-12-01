package exercises;

import verifier.VerifierForEx2;

import java.util.Arrays;

public class ConverterEx2 {


    public static int convertStringToInt(String in) {
        if (VerifierForEx2.isConvertibleToNumber(in)) {
            int result = 0;
            char[] numberInCharArray = in.toCharArray();
            int i = 0;
            if (numberInCharArray[0] == '-') i++;
            for (; i < numberInCharArray.length; i++) {
                result += (numberInCharArray[i] - '0') * Math.pow(10, numberInCharArray.length - i - 1);
            }
            if (in.charAt(0) == '-') result *= -1;
            return result;
        } else throw new RuntimeException("Can't convert to int");
    }

    public static double convertStringToDouble(String in) {
        if (VerifierForEx2.isConvertibleToNumberWithComma(in)) {
            double result = 0;
            boolean containComma = false;
            char[] numberInCharArray = in.toCharArray();

            for (char c : numberInCharArray){
                if (c == ',') {
                    containComma = true;
                    break;
                }
            }
            if (!containComma) return convertStringToInt(in);

            double numberAfterComma = 0;
            int i = 0;
            if (numberInCharArray[0] == '-') i++;
            for (; i < numberInCharArray.length; i++) {
                if (numberInCharArray[i] == ',') {
                    result /= Math.pow(10, numberInCharArray.length - i);
                    numberInCharArray = Arrays.copyOfRange(numberInCharArray, i + 1, numberInCharArray.length);
                    break;
                }

                result += (numberInCharArray[i] - '0') * Math.pow(10, numberInCharArray.length - i - 1);
            }
            for (int n = 0; n < numberInCharArray.length; n++) {
                numberAfterComma += (numberInCharArray[n] - '0') * Math.pow(10, numberInCharArray.length - n - 1);
                if (n == numberInCharArray.length - 1) {
                    numberAfterComma /= Math.pow(10, numberInCharArray.length);
                }
            }
            result += numberAfterComma;
            if (in.charAt(0) == '-') result *= -1;
            return result;
        } else throw new RuntimeException("Can't convert to int");
    }
}
