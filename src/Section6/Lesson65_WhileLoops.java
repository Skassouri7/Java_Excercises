package Section6;

public class Lesson65_WhileLoops {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5){
            //System.out.println(i);
            i++;
        }

        int j = 1;

        while (j  <= 50){

            if (j % 2 == 0) {
                j++;
                continue;
            }
            System.out.println(j + " ");
            j++;


        }
    }
}
