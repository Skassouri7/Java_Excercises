package Section5;

public class Challenge54 {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds){

        int minutes = 0;

        if (seconds >= 0){
            minutes = seconds / 60;
            System.out.println(minutes);
            return getDurationString(minutes, seconds % 60);
        }

        return "Invalid Inputs for minutes and seconds, both must be positive and minutes has to be under 59";
    }
    public static String getDurationString(int minutes, int seconds){

        String time = "";
        int hours = 0;
        int remainingMinutes = 0;
        int remainingSeconds = 0;

        if (minutes > 0 && seconds > 0 && seconds < 59) {
            hours = minutes / 60;
            remainingMinutes = minutes % 60;
            remainingSeconds = seconds % 60;
            time = hours + "hr " + remainingMinutes + "mm " + remainingSeconds + "s";
        } else {
            return "Invalid Inputs for minutes and seconds, both must be positive and minutes has to be under 59";
        }

        return time;
    }
}
