package Section7.Lesson104_Challenge;

public class BrewMaster {

    private boolean hasWorkToDo;

    public void brewCoffee(){
        if (hasWorkToDo){
            System.out.println("Brewing Coffee.");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
