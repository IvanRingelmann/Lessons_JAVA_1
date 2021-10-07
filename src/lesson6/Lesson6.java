package lesson6;

import lesson6.Animal;
import lesson6.Cat;
import lesson6.Dog;

public class Lesson6 {

    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Сильвестр"),
                new Cat("Стивен"),
                new Dog("Джек"),
                new Dog("Чак"),
                new Dog("Жан"),
        };

        for (Animal i : animals) {
            i.run(500);
            i.run(20);
            i.swim(500);
            i.swim(5);
        }
        System.out.println("Всего котов: " + Cat.nCat);
        System.out.println("Всего собак: " + Dog.nDog);
        System.out.println("Всего животных: " + Animal.nAnimal);
    }
}
