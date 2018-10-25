package Java_Alishev_Course.interfaces_less_26;

public class Person implements Info{
    public Person(String name) {
        this.name = name;
    }

    public String name;

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println(String.format("Name is %s",name));
    }
}
