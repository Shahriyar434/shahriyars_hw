package mygame.heroes;

class Hero {
    String name;
    int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " attacks");
    }
}

class Warrior extends Hero {
    public Warrior(String name, int health) {
        super(name, health);
    }

    public void heavyAttack() {
        System.out.println(name + " performs a heavy attack");
    }
}

class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    public void castSpell() {
        System.out.println(name + " casts a spell");
    }
}

class Archer extends Hero {
    public Archer(String name, int health) {
        super(name, health);
    }

    public void shootArrow() {
        System.out.println(name + " shoots an arrow");
    }
}

public class Torfin {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Jake", 100);
        Mage mage = new Mage("Fines", 100);
        Archer archer = new Archer("Ferb", 50);

        // Атаки
        warrior.attack();
        warrior.heavyAttack();

        mage.attack();
        mage.castSpell();

        archer.attack();
        archer.shootArrow();
    }
}
