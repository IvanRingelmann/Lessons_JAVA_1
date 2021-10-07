package lesson6;

public abstract class Animal {

    protected String name;
    public static int nAnimal;

    Animal() {
        nAnimal++;
    }

    public void run(int l) {
        System.out.println(name + " пробежал " + l + " м.");
    }

    public void swim(int l) {
        System.out.println(name + " проплыл " + l + " м.");
    }
}