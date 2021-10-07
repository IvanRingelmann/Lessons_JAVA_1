package lesson7;

public class Lesson7 {

    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Семён", 5),
                new Cat("Васька", 3),
                new Cat("Мурзик", 3),
                new Cat("Сильвестр", 2),
                new Cat("Тишка", 1),
        };

        Plate p = new Plate(7);
        for (Cat c : cats) {
            c.eat(p);
            p.increaseFood((int) (Math.random() * 3));
        }

        for (Cat c : cats) {
            c.info();
        }
        p.info();
    }
}
