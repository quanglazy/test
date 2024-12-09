

public class Car_5914 {
    private String name_5914; // Tên xe
    private String type_5914; // Kiểu xe
    private double rentalPrice_5914; // Giá thuê mỗi ngày
    private boolean available_5914; // Tình trạng xe

    // Constructor
    public Car_5914(String name, String type, double rentalPrice, boolean available) {
        this.name_5914 = name;
        this.type_5914 = type;
        this.rentalPrice_5914 = rentalPrice;
        this.available_5914 = available;
    }

    // Getter và Setter
    public String getName_5914() {
        return name_5914;
    }

    public void setName_5914(String name) {
        this.name_5914 = name;
    }

    public String getType_5914() {
        return type_5914;
    }

    public void setType_5914(String type) {
        this.type_5914 = type;
    }

    public double getRentalPrice_5914() {
        return rentalPrice_5914;
    }

    public void setRentalPrice_5914(double rentalPrice) {
        this.rentalPrice_5914 = rentalPrice;
    }

    public boolean isAvailable_5914() {
        return available_5914;
    }

    public void setAvailable_5914(boolean available) {
        this.available_5914 = available;
    }

    // Phương thức hiển thị thông tin
    public void displayInfo_5914() {
        System.out.println("Tên xe: " + name_5914);
        System.out.println("Kiểu xe: " + type_5914);
        System.out.println("Giá thuê: " + rentalPrice_5914);
        System.out.println("Tình trạng xe: " + (available_5914 ? "Còn trống" : "Đang cho thuê"));
    }

    @Override
    public String toString() {
        return name_5914 + ", " + type_5914 + ", " + rentalPrice_5914 + ", " + (available_5914 ? "Còn trống" : "Đang cho thuê");
    }
}
