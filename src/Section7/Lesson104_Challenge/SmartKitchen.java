package Section7.Lesson104_Challenge;

public class SmartKitchen {
    private BrewMaster brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new BrewMaster();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public void addWater(){
        brewMaster.brewCoffee();
    }

    public void pourMilk(){
        iceBox.orderFood();
    }

    public void loadDishWasher(){
        dishWasher.doDishes();
    }

    public void doKitchenWork(){
        addWater();
        pourMilk();
        loadDishWasher();
    }

    public void setKitchenState(boolean brewMasterFlag, boolean dishWasherFlag, boolean iceBoxFlag){
        brewMaster.setHasWorkToDo(brewMasterFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(iceBoxFlag);
    }
}
