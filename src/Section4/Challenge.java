package Day1;

public class Challenge {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;

        double sum =  (var1 + var2) * 100.00;

        double sumRemainder = sum % 40.00;
        System.out.println("Remainder = " + sumRemainder);
        boolean isZero = (sumRemainder == 0) ? true : false;

        if(!isZero){
            System.out.println("got some remainder.");
        }
    }
}
