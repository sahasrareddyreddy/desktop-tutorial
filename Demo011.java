class Animal {
    void eat() {
        System.out.println("Dog eats dog food");
    }

    void sleep() {
        System.out.println("Dog sleeps in the night");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class Demo011 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}