package lesson6;

public class Dog extends Animal {

    final int RunMax = 500;
    final int SwimMax = 10;
    public static int nDog;

    public Dog(String name) {
        super.name = name;
        nDog++;
    }

    @Override
    public void run(int l) {
        if (l >= 0 && l <= RunMax) {
            super.run(l);
        } else {
            System.out.println("Собака не сможет столько пробежать!");
        }
    }

    @Override
    public void swim(int l) {
        if (l >= 0 && l <= SwimMax) {
            super.swim(l);
        } else {
            System.out.println("Собака не сможет столько проплыть!");
        }
    }
}
