package Section6;

public class Lesson67_DigitSumChallenge {
    public static void main(String[] args) {
        //System.out.println(sumDigits(1234));



//        System.out.println(reverse(num));
//        System.out.println(getDigitCount(num));
//        numberToWords(num);

//        System.out.println(getLargestPrime(21));

        printSquareStar(5);
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

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int num = reverse(number);
        int numCounter = 0;
        do{
            switch (num % 10){
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("Invalid Input");
            }
            numCounter++;
            num /= 10;
        } while (num > 0);

        for (int i = 0; i < getDigitCount(number) - numCounter; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse(int number){
        if (number < 0){
            number *= -1;
        }

        int reverse = 0;

        while (number > 0){
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0) {
            return -1;
        }

        int counter = 0;

        if (number == 0){
            counter++;
        }

        while (number > 0){
            counter++;
            number /= 10;
        }
        return counter;
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int i = 2;
        while (i <= number) {
            if (number % i == 0) {
                // i is a factor, divide number by i
                number /= i;
            } else {
                // i is not a factor, increment i
                i++;
            }
        }

        return i;
    }

    public static void printSquareStar(int number){

        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }

        int row = 1;

        while (row <= number){
            for (int col = 1; col <= number; col++){
                if (row == 1 || row == number) {
                    System.out.print("*");
                } else if (col == 1 || col == number){
                    System.out.print("*");
                } else if(row == col){
                    System.out.print("*");
                }else if (col == number - row + 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
            row++;
        }
    }
}
