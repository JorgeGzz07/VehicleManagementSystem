public class Main {
    public static void main(String[] args) {
        // Create and test Car
        Car myCar = new Car(120, 50.5, 4);
        myCar.start();
        myCar.displayFuel();
        myCar.honk();
        System.out.println("Car doors: " + myCar.getNumberOfDoors());

        System.out.println();

        // Create and test Bicycle
        Bicycle myBike = new Bicycle(15, 5.0, true);
        myBike.start();
        myBike.displayFuel();
        myBike.ringBell();

        System.out.println();

        // Test Bicycle without bell
        Bicycle noBellBike = new Bicycle(10, 4.5, false);
        noBellBike.start();
        noBellBike.displayFuel();
        noBellBike.ringBell();

        // Experiment with access modifiers by uncommenting (should cause error if invalid):
        // System.out.println(myCar.fuel); // private, not accessible
        // System.out.println(myCar.speed); // protected, accessible if in subclass or same package

    }
}
