package Section6;

public class Lesson67_DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123456));
    }

    public static int sumDigits(int number){
        if (number < 0){
            return -1;
        }

        int sum = 0;
        int temp = number;

        for (int i = 1; i <= number; i = i * 10){
            sum  += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}
