interface Vehical {
    void start();

    void stop();
}

class Car implements Vehical {
    public void start() {
        System.out.println("car starting");
    }

    public void stop() {
        System.out.println("car stopped");
    }
}

class Bike implements Vehical {
    public void start() {
        System.out.println("Bike starting");
    }

    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class Main {

    public static void main(String[] args) {
        Vehical myCar = new Car();
        myCar.start();
        myCar.stop();

        Vehical myBike = new Bike();
        myBike.start();
        myBike.stop();
    }
}