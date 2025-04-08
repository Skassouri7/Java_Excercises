package Section6;

public class Lesson67_DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1234));
    }

    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }

        int sum = 0;

        for (int i = number; i > 0; i /= 10){
            sum  += i % 10;
        }
//        while (number > 9){
//            sum += number % 10;
//            number /= 10;
//        }
        return sum;
    }
}
