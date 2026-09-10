abstract class Vehical {
    int noOfTyers;

    void displytyers() {
        System.out.println("No of tyers:" + noOfTyers);
    }

    abstract void start();
}

class Car extends Vehical {
    void start() {
        noOfTyers = 4;
        System.out.println("Car is start with key");
    }

}

class Bike extends Vehical {

    void start() {
        noOfTyers = 2;
        System.out.println("Bike is start with kick");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehical vehical = new Bike();
        vehical.start();

        Vehical vehical2 = new Car();
        vehical.start();
    }
}
