package Java_Alishev_Course.interfaces_less_26;

public class Animal implements Info {
    public int id;

    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + id);
    }
}
