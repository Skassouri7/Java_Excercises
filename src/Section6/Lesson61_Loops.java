package Section6;

public class Lesson61_Loops {
    public static void main(String[] args) {

        int primeCounter = 0;
        for (int i = 1; i <= 1000; i++){

            if (isPrime(i)){
                System.out.println(i + " is " + (isPrime(i) ? "" : "NOT ") + "a prime number. " + isPrime(i));
                primeCounter++;
                if(primeCounter == 3){
                    System.out.println("Found 3 - existing in for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber){

        if (wholeNumber <= 2){
            return wholeNumber == 2;
        }

        for (int i = 2; i * i <= wholeNumber; i++){
            if (wholeNumber % i == 0){
               return false;
            }
        }
        return true;
    }
}
