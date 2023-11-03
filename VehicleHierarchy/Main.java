public class Main {
    public static void main(String[] args){
        Car myCar = new Car("Toyota", "Camry", 2022, 4);
        Motorcycle myMotorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, false);
        System.out.println("Car Details:");
        System.out.println("Make:"+myCar.getMake());
        System.out.println("Model:"+myCar.getModel());
        System.out.println("Year:"+myCar.getYear());
        System.out.println("Number of Doors:"+myCar.getNumDoors());
        myCar.start();
        myCar.accelerate();
        myCar.stop();

        System.out.println("\nMotorcycle Details");
        System.out.println("Make:"+myMotorcycle.getMake());
        System.out.println("Model:"+myMotorcycle.getModel());
        System.out.println("Year:"+myMotorcycle.getYear());
        System.out.println("Has Sidecar:"+myMotorcycle.hasSidecar());
        myMotorcycle.start();
        myMotorcycle.accelerate();
        myMotorcycle.stop();
    }
}
