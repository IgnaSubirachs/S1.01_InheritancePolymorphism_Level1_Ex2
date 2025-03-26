public class Car {
    private static final String brand = "Toyota";
    private static String model ="Corolla";
    private final int horsePower;

    public Car(int horsePower) {
        this.horsePower = horsePower;

    }

    public static void setModel(String model) {
        Car.model = model;
    }


    public static String getModel() {
        return model;
    }


    public static void brakeCar() {
        System.out.println("The car is braking");
    }

    public void acceleratingCar() {
        System.out.println("The car is accelerating");
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower + " Brand= " + Car.brand + " Model= " + Car.model + '}';

    }
}
