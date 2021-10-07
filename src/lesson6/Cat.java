package lesson6;

public class Cat extends Animal {
    final int RunMax = 200;
    public static int nCat;

    public Cat(String name) {
        super.name = name;
        nCat++;
    }

    @Override
    public void run(int l) {
        if (l >= 0 && l <= RunMax) {
            super.run(l);
        } else {
            System.out.println("Кот не может пробежать " + l + " метров!");
        }
    }

    @Override
    public void swim(int l) {
        System.out.println("Кошки не умеют плавать!");
    }
}
