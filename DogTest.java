package ru.mirea.lab_1;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Шарик", 15);
        Dog dog2 = new Dog("Арчи", 7);
        Dog dog3 = new Dog("Муму", 1);
        Dog dog4 = new Dog("Дося");

        System.out.println(dog1.toString());
        System.out.println(dog2.humanAge());
        dog3.setAge(200);
        System.out.println(dog3.humanAge());
        System.out.println(dog4.toString());
    }
}
