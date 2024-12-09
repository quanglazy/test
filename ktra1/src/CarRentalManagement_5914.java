


import java.util.ArrayList;

public class CarRentalManagement_5914 {
    private ArrayList<Car_5914> carList_5914 = new ArrayList<>();

    public void addCar_5914(Car_5914 car) {
        carList_5914.add(car);
    }

    public void displayAllCars_5914() {
        System.out.println("Danh sách xe:");
        for (Car_5914 car : carList_5914) {
            System.out.println(car);
        }
    }

    public void searchByName_5914(String name) {
        System.out.println("Kết quả tìm kiếm:");
        boolean found = false;
        for (Car_5914 car : carList_5914) {
            if (car.getName_5914().equalsIgnoreCase(name)) {
                car.displayInfo_5914();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe có tên: " + name);
        }
    }
}
