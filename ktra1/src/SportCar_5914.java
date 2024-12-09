

public class SportCar_5914 extends Car_5914 {
    private int horsepower_5914; // Công suất

    public SportCar_5914(String name, double rentalPrice, boolean available, int horsepower) {
        super(name, "SportCar", rentalPrice, available);
        this.horsepower_5914 = horsepower;
    }

    public int getHorsepower_5914() {
        return horsepower_5914;
    }

    public void setHorsepower_5914(int horsepower) {
        this.horsepower_5914 = horsepower;
    }

    @Override
    public void displayInfo_5914() {
        super.displayInfo_5914();
        System.out.println("Công suất: " + horsepower_5914 + " mã lực");
    }
}
