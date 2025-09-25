package OOP;

class Car {
    String type;
    String model;
    String color;
    int speed;
    int increaseSpeed;
    int decreaseSpeed;
    int speedLimit = 180;

    void increaseSpeed(int increase){
        if ((speed + increase) < speedLimit){
            speed += increase;
        }
    }

    void decreaseSpeed(int decrease){
        if (speed > 0){
            speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(model + " Speed : " + speed);
    }
}
