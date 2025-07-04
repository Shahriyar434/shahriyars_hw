package mygame.heroes.zoo.store;

public class ZooMain {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion("abdul"),
                new Parrot("maqa"),
                new Fish("ali")
        };

        for (Animal animal : animals) {
            System.out.println("type: " + animal.getClass().getSimpleName());
            animal.info();
            animal.makeSound();
            animal.move();
            animal.eat();
            System.out.println("-------------");
        }
    }
}

// Родительский класс
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal's sound");
    }

    public void move() {
        System.out.println("Animal's move");
    }

    public void eat() {
        System.out.println("Animal's step");
    }

    public void info() {
        System.out.println("Animal's name: " + name);
    }
}


class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("lion's sound");
    }

    @Override
    public void move() {
        System.out.println("lion is ranning");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating met");
    }
}


class Parrot extends Animal {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("parrot say hello");
    }

    @Override
    public void move() {
        System.out.println("parrot is flying");
    }

    @Override
    public void eat() {
        System.out.println("parrot is eating");
    }
}


class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("fish sound");
    }

    @Override
    public void move() {
        System.out.println("fish is swimming");
    }

    @Override
    public void eat() {
        System.out.println("fish is eating");
    }
}
