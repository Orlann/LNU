package Java_Alishev_Course.polimorphism_abstract_classes_less_29;

import Java_Alishev_Course.interfaces_less_26.Animal;

public class AppLess29 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animalDog = new Dog();

//        animal.bark();  // Помилка.  bark може бути викликаний тільки до об'єктів класу Dog
        dog.bark();
        ((Dog) animalDog).bark();
        animal.eat();       // Animal is eating
        dog.eat();          // Dog is eating
        animalDog.eat();    // Dog is eating
    }

    public void testDog(){

    }
}
