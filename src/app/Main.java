package app;

public class Main {
    public static void main(String[] args) {

        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.move();
        plane.move();

        System.out.println("Car создан CarFactory: "+(car instanceof Car));
        System.out.println("Plane создан PlaneFactory: "+(plane instanceof Plane));
    }
}
