package spring_introductioin;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Гав-Гав!");
    }
}
