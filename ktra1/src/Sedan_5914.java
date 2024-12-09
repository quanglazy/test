

public class Sedan_5914 extends Car_5914 {
    private int numDoors_5914; // Số cửa

    public Sedan_5914(String name, double rentalPrice, boolean available, int numDoors) {
        super(name, "Sedan", rentalPrice, available);
        this.numDoors_5914 = numDoors;
    }

    public int getNumDoors_5914() {
        return numDoors_5914;
    }

    public void setNumDoors_5914(int numDoors) {
        this.numDoors_5914 = numDoors;
    }

    @Override
    public void displayInfo_5914() {
        super.displayInfo_5914();
        System.out.println("Số cửa: " + numDoors_5914);
    }
}
