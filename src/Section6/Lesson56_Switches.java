package Section6;

public class Lesson56_Switches {

    public static void main(String[] args) {

        int switchValue = 5;

        switch (switchValue) {
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
                System.out.println("Value is not 1, 2 or 3");
        }

        System.out.println(getQuarter("APRIL"));
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + "is not a month";
                yield badResponse;
            }
        };

    }
}
