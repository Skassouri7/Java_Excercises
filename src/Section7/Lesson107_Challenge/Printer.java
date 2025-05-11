package Section7.Lesson107_Challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerLevel){

        int tempAmount = tonerLevel + this.tonerLevel;;
        if (tempAmount < 0 || tempAmount > 100){
            return tonerLevel = -1;
        }
        return tempAmount;
    }

    public int printPages(int pages){
        int jobsPrinted = 0;
        if (duplex){
            jobsPrinted = pages / 2 + (pages % 2);
            System.out.println(pages);
        }
        pagesPrinted += jobsPrinted;
        return jobsPrinted;
    }

    public int getPagesPrinted(){
        return pagesPrinted ;
    }
}