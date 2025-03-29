package Section5;

public class Challenge54 {

    public static void main(String[] args) {

        System.out.println(getDurationString(23));
    }

    public static String getDurationString(int seconds){

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }
    public static String getDurationString(int minutes, int seconds){

        String time = "";
        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        time = hours + "hr " + remainingMinutes + "mm " + remainingSeconds + "s";
        return time;
    }
}
