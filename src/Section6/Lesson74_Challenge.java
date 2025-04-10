package Section6;

import java.util.Scanner;

public class Lesson74_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        int numCount = 1;
        int sum = 0;
        
        do{
            System.out.println("Enter Number #" + numCount);

            try {
                number = Integer.parseInt(sc.nextLine());
                sum += number;
                numCount++;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid Number");
            }
        } while(numCount <= 5);

        System.out.println("Sum is: " + sum);
    }
}
