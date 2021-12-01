package exercises;

public class FizzBuzzEx3 {

    public void FizzBuzz(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<=100; i++){
            boolean multipleOfThreeOrFive = false;
            if (i%3 == 0 && i!=0) {
                multipleOfThreeOrFive = true;
                stringBuilder.append("Fizz");
            }

            if (i%5 == 0 && i!=0) {
                multipleOfThreeOrFive = true;
                stringBuilder.append("Buzz");
            }

            if (multipleOfThreeOrFive){
                System.out.println(stringBuilder);
                stringBuilder.setLength(0);
            }
            else System.out.println(i);
        }
    }
}
