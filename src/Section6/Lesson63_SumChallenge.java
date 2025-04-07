package Section6;

public class Lesson63_SumChallenge {
    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Numbers divisible by 3 and 5 in the loop are: " + i);
                sum += i;
                counter++;
                System.out.println(counter);
                if (counter == 5){
                    break;
                }
            }
        }

        System.out.println("The sum of numbers divisible by 5 and 3: " + sum);
    }
}
