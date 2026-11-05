class Animal {

    String name;
    int age;

    void eat() {

        System.out.println(name + " is eating.");
    }

    void sleep() {

        System.out.println(name + " is sleeping.");
    }
}

// Dog class
class Dog extends Animal {

    void bark() {

        System.out.println(name + " is barking.");
    }
}

// Cat class
class Cat extends Animal {

    void meow() {

        System.out.println(name + " is meowing.");
    }
}

public class AnimalKingdom {

    public static void main(String[] args) {

        // Creating Dog object
        Dog d = new Dog();

        d.name = "Tommy";
        d.age = 3;

        System.out.println("Dog Details:");
        System.out.println("Name: " + d.name);
        System.out.println("Age: " + d.age);

        d.eat();
        d.sleep();
        d.bark();

        System.out.println();

        // Creating Cat object
        Cat c = new Cat();

        c.name = "Kitty";
        c.age = 2;

        System.out.println("Cat Details:");
        System.out.println("Name: " + c.name);
        System.out.println("Age: " + c.age);

        c.eat();
        c.sleep();
        c.meow();
    }
}