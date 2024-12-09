

public class SUV_5914 extends Car_5914 {
    private boolean fourWheelDrive_5914; // Dẫn động 4 bánh

    public SUV_5914(String name, double rentalPrice, boolean available, boolean fourWheelDrive) {
        super(name, "SUV", rentalPrice, available);
        this.fourWheelDrive_5914 = fourWheelDrive;
    }

    public boolean isFourWheelDrive_5914() {
        return fourWheelDrive_5914;
    }

    public void setFourWheelDrive_5914(boolean fourWheelDrive) {
        this.fourWheelDrive_5914 = fourWheelDrive;
    }

    @Override
    public void displayInfo_5914() {
        super.displayInfo_5914();
        System.out.println("Dẫn động 4 bánh: " + (fourWheelDrive_5914 ? "Có" : "Không"));
    }
}
