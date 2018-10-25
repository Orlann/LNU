package Java_Alishev_Course.interfaces_less_26;

public class Appl {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Ivan");

        Info animal2 = new Animal(2);
        Info person2 = new Person("Olga");

        animal.showInfo();
        person.showInfo();

        animal2.showInfo();
        person2.showInfo();

        showInfo(animal);
        showInfo(person);
        showInfo(animal2);
        showInfo(person2);
    }

    public static void showInfo(Info info){
        info.showInfo();
    }
}
