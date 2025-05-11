package Section7.Lesson104_Challenge;

public class Refrigerator {

    private boolean hasWorkToDo;

    public void orderFood(){
        if (hasWorkToDo){
            System.out.println("Ordering food.");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
