public class Main {
    public static void main(String[] args) {
        Car.setModel("Auris");
       Car c1=new Car(50);
       Car c2=new Car(150);
       Car c3=new Car(1000);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.acceleratingCar();
        Car.brakeCar();



    }
}
