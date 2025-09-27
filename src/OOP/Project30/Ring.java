package OOP.Project30;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                this.f2.health = this.f1.hit(f2);
                if (isWin()) {
                    break;
                }

                this.f1.health = this.f2.hit(f1);
                if (isWin()) {
                    break;
                }
                printScore();
            }
        } else {
            System.out.println("The fighters' weight classes do not match!");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " won the match!");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " won the match!");
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("--------");
        System.out.println(this.f1.name + " Remaining Health: " + this.f1.health);
        System.out.println(this.f2.name + " Remaining Health: " + this.f2.health);
    }
}
