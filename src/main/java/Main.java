public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car1 = new Car("green", "Honda", 5);
        Car car2 = new Car("red", "Kia", 3);
        Car car3 = new Car("black", "Opel", 3);

        factory.buildCar(car1);
        factory.buildCar(car2);
    }
}

