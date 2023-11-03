public class Motorcycle extends Vehicle{
    private boolean hasSidecar;
    public Motorcycle(String make, String model, int year, boolean hasSidecar){
        super(make,model,year);
        this.hasSidecar = hasSidecar;
    }
    public boolean hasSidecar(){
        return hasSidecar;
    }

    @Override
    public void accelerate(){
        System.out.println("The motorcycle is accelerating");
    }
}