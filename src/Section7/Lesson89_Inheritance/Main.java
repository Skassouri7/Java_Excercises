package Section7.Lesson89_Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal  = new Animal("Generic Animal", "Huge",  400);
        doAnimalStuff(animal, "fast");

        Dog dog = new Dog();
        doAnimalStuff(dog, "slow");

        Dog yorkie = new Dog("Yorkie", 30);
        doAnimalStuff(yorkie, "fast");

        Dog goldenRetriever = new Dog("Labrador", 65, "Floppy", "Swimmer" );
        doAnimalStuff(goldenRetriever, "fast");

        Dog wolf = new Dog("wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 2);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);

        System.out.println(animal);
        System.out.println("____");
    }
}
