package abstractClass;

public class Cat extends Animal implements AnimalStuff{
    Cat(int age, String name) {
        super(age, name);
    }
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    // Method from AnimalStuff Interface
    @Override
    public void poop() {
        System.out.println("Plobfobfobdb");
    }
}
