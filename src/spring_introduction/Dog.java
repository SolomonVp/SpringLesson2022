package spring_introduction;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Гав-Гав!");
    }
}
