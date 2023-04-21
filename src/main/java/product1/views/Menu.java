package product1.views;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    static FarmView farmView = new FarmView();
    static PaymentView paymentView = new PaymentView();
    static Scanner scanner = new Scanner(System.in);

    private static User currentUser = null;
    private static boolean isFinished = false;


    public static void boss() {
        boolean isLoggedIn = checkLogin();
        if (!isLoggedIn) {
            login();
            return;
        }
        boolean isFinished = false;
        Scanner scanner = new Scanner(System.in);
        menuBoss();
        while (!isFinished) {
            try {
                System.out.println("\nChọn chức năng ");
                System.out.print("\t➺ ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        farmView.showProductBoss();
                        break;
                    case 2:
                        farmView.showProductDescriptionBoss();
                        break;
                    case 3:
                        farmView.add();
                        break;
                    case 4:
                        farmView.updateProduct();
                        break;
                    case 5:
                        farmView.findProductbyNameBoss();
                        break;
                    case 6:
                        farmView.findProductbyTypeBoss();
                        break;
                    case 7:
                        paymentView.showAllIncome();
                        break;
                    case 8:
                        chon();
                        break;
                    case 9:
                        exit();
                        isFinished = true;
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                }
            } catch (InputMismatchException e) {
                System.out.println("Nhập sai! vui lòng nhập lại");
                scanner.nextLine();
            }
        }
    }


    public static User login() {
        Loginview loginView = new Loginview();
        boolean isLoggedIn = false;
        User user = null;
        while (!isLoggedIn) {
            try {
                user = loginView.login();
                isLoggedIn = true;
                currentUser = user;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Có lỗi khi đăng nhập. Vui lòng thử lại.");
                return null;
            }
        }
        return user;
    }

    public static boolean checkLogin() {
        if (currentUser == null) {
            System.out.println("Vui lòng đăng nhập trước khi sử dụng chức năng này!");
            return false;
        }
        return true;
    }


    public static void guest() {
        menuGuest();
        try {
            System.out.println("\nChọn chức năng ");
            System.out.print("\t➺ ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    farmView.showProductGuest();
                    break;
                case 2:
                    farmView.showProductDescriptionGuest();
                    break;
                case 3:
                    farmView.findProductbyNameGuest();
                    break;
                case 4:
                    farmView.findProductbyTypeGuest();
                    break;
                case 5:
                    paymentView.buy();
                    break;
                case 6:
                    chon();
                    break;
                case 7:
                    exit();
                    break;
                default:
                    System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                    guest();
            }
        } catch (Exception e) {
            System.out.println("Nhập sai! vui lòng nhập lại");
            guest();
        }
    }


    public static void chon() {
        do {
            menuMain();
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("\nChọn chức năng ");
                System.out.print("\t➺ ");
                int number = scanner.nextInt();
                switch (number) {
                    case 1:
                        boss();
                        break;
                    case 2:
                        guest();
                        break;
                    case 3:
                        exit();
                        break;
                    default:
                        System.out.println("Chọn chức năng không đúng! Vui lòng chọn lại");
                        chon();
                }

            } catch (InputMismatchException io) {
                System.out.println("Nhập sai! Vui lòng nhập lại");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }

    public static void menuMain() {
        System.out.println();
        System.out.println("❄❄❄❄❄❄-- Trang Trại -- ❄❄❄❄❄❄");
        System.out.println("❄❄  ✌  option :               ❄❄ ");
        System.out.println("❄❄      1.    Chủ Trang Trại  ❄❄ ");
        System.out.println("❄❄      2.    Người Mua       ❄❄ ");
        System.out.println("❄❄      3.    Thoát           ❄❄ ");
        System.out.println("❄❄                            ❄❄ ");
        System.out.println("❄❄ ❄❄❄❄❄❄❄❄❄❄❄❄❄❄❄❄❄❄❄❄");
    }

    public static void exit() {
        System.out.println("\t\t\t\t\t\tCám ơn quý khách");
        System.out.println("\t\t\t\t\t\tHẹn gặp lại ✌✌✌✌✌✌✌ ");

        System.exit(0);
    }

    public static void menuBoss() {
        System.out.println("♕♕♕♕♕♕♕♕♕♕ Chủ Trang Trại ♕♕♕♕♕♕♕♕♕♕♕♕♕");
        System.out.println("✿✿✿                                           ✿✿✿");
        System.out.println("✿✿✿   1. Hiển thị danh sách động Vật          ✿✿✿");
        System.out.println("✿✿✿   2. Hiển thị lịch sử tiêm vacxin         ✿✿✿");
        System.out.println("✿✿✿   3. Nhập số lượng động vật vào chuồng    ✿✿✿");
        System.out.println("✿✿✿   4. Sửa thông tin động vật               ✿✿✿");
        System.out.println("✿✿✿   5. Tìm kiếm động vật theo tên           ✿✿✿");
        System.out.println("✿✿✿   6. Tìm kiếm động vật theo loại          ✿✿✿");
        System.out.println("✿✿✿   7. Xem tổng doanh thu xuất chuồng       ✿✿✿");
        System.out.println("✿✿✿   8. Quay lại                             ✿✿✿");
        System.out.println("✿✿✿   9. Thoát                                ✿✿✿");
        System.out.println("✿✿✿                                           ✿✿✿");
        System.out.println("♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕");
    }

    public static void menuGuest() {
        System.out.println("♕♕♕♕♕♕♕♕  Người Mua ♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕");
        System.out.println("✿✿✿                                              ✿✿✿");
        System.out.println("✿✿✿   1. Hiển thị danh sách động Vật             ✿✿✿");
        System.out.println("✿✿✿   2. Hiển thị lịch sử tiêm vacxin            ✿✿✿");
        System.out.println("✿✿✿   3. Tìm kiếm  động vật theo tên             ✿✿✿");
        System.out.println("✿✿✿   4. Tìm kiếm động vật theo loại             ✿✿✿");
        System.out.println("✿✿✿   5. Mua                                     ✿✿✿");
        System.out.println("✿✿✿   6. Quay lại                                ✿✿✿");
        System.out.println("✿✿✿   7. Thoát                                   ✿✿✿");
        System.out.println("✿✿✿                                              ✿✿✿");
        System.out.println("♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕♕ ");
    }
}
