package Section7.Lesson104_Challenge;

public class DishWasher {

    private boolean hasWorkToDo;

    public void doDishes(){
        if (hasWorkToDo){
            System.out.println("washing the dishes.");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
