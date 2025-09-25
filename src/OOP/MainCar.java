package OOP;

public class MainCar {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.model = "Audi A7";
        audi.speed = 20;
        audi.increaseSpeed(40);
        audi.printSpeed();

        Car bmw = new Car();
        bmw.model = "BMW 520i";
        bmw.speed = 140;
        bmw.decreaseSpeed(80);
        bmw.printSpeed();

        Car mercedes = new Car();
        mercedes.model = "Mercedes G";
        mercedes.speed = 50;
        mercedes.increaseSpeed(10);
        mercedes.printSpeed();
    }
}
