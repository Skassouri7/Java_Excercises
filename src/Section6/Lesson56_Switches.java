package Section6;

public class Lesson56_Switches {

    public static void main(String[] args) {

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Value is " + switchValue);
        }
    }
}
