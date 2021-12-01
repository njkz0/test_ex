import exercises.ConverterEx2;
import exercises.FizzBuzzEx3;
import exercises.ReplacerEx1;

public class Main {
    public static void main(String[] args) {

        //ex1
        String abc = "123b567b";
        System.out.println(  ReplacerEx1.replaceAllChar(abc, 'b', '4'));
        System.out.println(  ReplacerEx1.replaceFirstChar(abc, 'b', '4'));

        //ex2
        System.out.println(ConverterEx2.convertStringToDouble("12,345"));
        System.out.println(ConverterEx2.convertStringToInt("12"));

        //ex3
        FizzBuzzEx3 fizzBuzzEx3 = new FizzBuzzEx3();
        fizzBuzzEx3.FizzBuzz();

    }
}
