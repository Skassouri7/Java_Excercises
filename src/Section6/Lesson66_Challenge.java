package Section6;

public class Lesson66_Challenge {

    public static void main(String[] args) {
        int i = 4;

//        while (i <= 20){
//
//            if(isEvenNumber(i)){
//                System.out.println("Even Number: " + i);
//            }
//            i++;
//        }

        int evenCounter = 0;
        int oddCounter = 0;

        while (i <= 20){
            i++;
            if (!isEvenNumber(i)){
                oddCounter++;
                System.out.println("Odd Number: " + i);
                continue;
            }

            evenCounter++;

            if (evenCounter >= 5){
                System.out.println("Even Number: " + i);
                break;
            }
            System.out.println("Even Number: " + i);
        }
        System.out.println("Total Of odd Numbers: " + oddCounter);
        System.out.println("Total Of even Numbers: " + evenCounter);
    }

    public static boolean isEvenNumber(int num){
        return num % 2 == 0;
    }
}
