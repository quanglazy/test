

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRentalManagement_5914 manager = new CarRentalManagement_5914();
        manager.addCar_5914(new Sedan_5914("Sedan1_5914", 500.0, true, 4));
        manager.addCar_5914(new Sedan_5914("Sedan2_5914", 600.0, true, 4));
        manager.addCar_5914(new SUV_5914("SUV1_5914", 700.0, true, true));
        manager.addCar_5914(new SUV_5914("SUV2_5914", 800.0, false, false));
        manager.addCar_5914(new SportCar_5914("SportCar1_5914", 1000.0, true, 300));
        // In thông tin sinh viên
        System.out.println("Quản lý Thuê xe tự lái – Nguyễn Nhuận Quang – 5914 – kỳ 2024.1 – Ngày 09/12/2024 (Tuần 15).");

        while (true) {
            System.out.println("\n1. Thêm xe");
            System.out.println("2. Hiển thị danh sách tất cả các xe");
            System.out.println("3. Tìm kiếm và hiển thị thông tin xe theo tên được nhập từ bàn phím");
            System.out.println("4. Thoát - Nguyễn Nhuận Quang – Mã lớp VJIT.");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm

            switch (choice) {
                case 1 -> {
                    System.out.println("\nNhập dữ liệu - Nguyễn Nhuận Quang - 5914");
                    System.out.println("a. Thêm xe Sedan_5914");
                    System.out.println("b. Thêm xe SUV_5914");
                    System.out.println("c. Thêm xe SportCar_5914");
                    System.out.print("Chọn: ");
                    char type = scanner.nextLine().charAt(0);

                    switch (type) {
                        case 'a' -> {
                            System.out.println("\nNguyễn Nhuận Quang - 5914");
                            System.out.print("Tên xe: ");
                            String name = scanner.nextLine();
                            System.out.print("Giá thuê: ");
                            double price = scanner.nextDouble();
                            System.out.print("Tình trạng xe (true: Còn trống, false: Đang cho thuê): ");
                            boolean available = scanner.nextBoolean();
                            System.out.print("Số cửa của xe: ");
                            int doors = scanner.nextInt();
                            scanner.nextLine(); // Xóa bộ đệm
                            manager.addCar_5914(new Sedan_5914(name, price, available, doors));
                            System.out.println("Thêm xe Sedan thành công!");
                        }
                        case 'b' -> {
                            System.out.println("\nNguyễn Nhuận Quang - 5914");
                            System.out.print("Tên xe: ");
                            String name = scanner.nextLine();
                            System.out.print("Giá thuê: ");
                            double price = scanner.nextDouble();
                            System.out.print("Tình trạng xe (true: Còn trống, false: Đang cho thuê): ");
                            boolean available = scanner.nextBoolean();
                            System.out.print("Xe dẫn động bốn bánh (true/false): ");
                            boolean fourWheel = scanner.nextBoolean();
                            scanner.nextLine(); // Xóa bộ đệm
                            manager.addCar_5914(new SUV_5914(name, price, available, fourWheel));
                            System.out.println("Thêm xe SUV thành công!");
                        }
                        case 'c' -> {
                            System.out.println("\nNguyễn Nhuận Quang - 5914");
                            System.out.print("Tên xe: ");
                            String name = scanner.nextLine();
                            System.out.print("Giá thuê: ");
                            double price = scanner.nextDouble();
                            System.out.print("Tình trạng xe (true: Còn trống, false: Đang cho thuê): ");
                            boolean available = scanner.nextBoolean();
                            System.out.print("Công suất xe: ");
                            int horsepower = scanner.nextInt();
                            scanner.nextLine(); // Xóa bộ đệm
                            manager.addCar_5914(new SportCar_5914(name, price, available, horsepower));
                            System.out.println("Thêm xe SportCar thành công!");
                        }
                        default -> System.out.println("Lựa chọn không hợp lệ.");
                    }
                }
                case 2 -> {
                    System.out.println("\nHiển thị thông tin - Nguyễn Nhuận Quang - 5914");
                    manager.displayAllCars_5914();
                }
                case 3 -> {
                    System.out.println("\nTìm kiếm - Nguyễn Nhuận Quang - 5914");
                    System.out.print("Nhập tên xe_5914 cần tìm: ");
                    String name = scanner.nextLine();
                    manager.searchByName_5914(name);
                }
                case 4 -> {
                    System.out.println("\nThoát khỏi chương trình – Nguyễn Nhuận Quang – Mã lớp 744529.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}
