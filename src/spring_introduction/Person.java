package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created!");
//        this.pet = pet;
//    }

        public Person() {
        System.out.println("--- Person bean is created!");
    }

    public void setPet(Pet pet) {
        System.out.println("--- Class person : set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("--- Class person: set surName");
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("--- Class person: set setAge");
        return age;
    }

    public void setAge(int age) {

            this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
