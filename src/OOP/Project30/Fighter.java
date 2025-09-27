package OOP.Project30;

public class Fighter {
    String name;
    int damage;
    int weight;
    int health;
    int dodge;

    Fighter(String name, int damage, int weight, int health, int dodge) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter opponent) {
        System.out.println("------------");
        System.out.println(this.name + " => " + opponent.name + " dealt " + this.damage + " damage!");

        if (opponent.isDodged()) {
            System.out.println(opponent.name + " blocked the incoming damage!");
            return opponent.health;
        }

        if (opponent.health - this.damage < 0) {
            return 0;
        }

        return opponent.health - this.damage;
    }

    boolean isDodged() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
}
