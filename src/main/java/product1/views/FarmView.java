package product1.views;

import product1.model.Farm;
import product1.model.PType;
import product1.model.Status;
import product1.services.ProductService;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class FarmView {
    DecimalFormat format = new DecimalFormat("###,###,###" + " đ");
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    ProductService productService = new ProductService();


    public FarmView() {

    }

    public void add() {
        int id;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập ID động vật: ");
            System.out.print("\t➺ ");
            try {
                id = input.nextInt();
                if (id > 0) {
                    if (productService.existProduct(id)) {
                        System.out.println(" ★ ID này đã tồn tại ★");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("\t ★ Số lượng phải lớn hơn 0 ★");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("\t ★ Số lượng phải là 1 số ★");
                System.out.println();
            }
        }
        PType type = null;
        int luachon;
        while (true) {
            boolean check = false;
            System.out.println("=    = Loại động vật =    =");
            System.out.println("∥      1.  bò             ∥");
            System.out.println("∥      2.  gà             ∥");
            System.out.println("∥      3.  ngựa           ∥");
            System.out.println("∥      4.  vịt            ∥");
            System.out.println("∥      5.  trâu           ∥");
            System.out.println("∥      6.  heo            ∥");
            System.out.println("∥      7.  dê             ∥");
            System.out.println("= = = = = = = = = = = = = =");
            System.out.println("Nhập tên loại động vật ");
            System.out.print("\t ➺ ");
            try {
                luachon = Integer.parseInt(scanner.nextLine());
                switch (luachon) {
                    case 1:
                        type = PType.bò;
                        check = true;
                        break;
                    case 2:
                        type = PType.gà ;
                        check = true;
                        break;
                    case 3:
                        type = PType.ngựa;
                        check = true;
                        break;
                    case 4:
                        type = PType.vịt ;
                        check = true;
                        break;
                    case 5:
                        type = PType.trâu;
                        check = true;
                        break;
                    case 6:
                        type = PType.heo ;
                        check = true;
                        break;
                    case 7:
                        type = PType.dê;
                        check = true;
                        break;
                    default:
                        System.out.println("\t★ Nhập không đúng! Vui lòng nhập lại ★");
                        System.out.println("\t=======================================");
                        break;
                }
                if (check) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("\t ★ Lựa chọn phải là 1 số ★");
                System.out.println("\t=========================");
            }
        }
        String name;
        while (true) {
            System.out.println("Nhập tên động vật: ");
            System.out.print("\t➺ ");
            String check = scanner.nextLine();
            if (productService.existProductName(check)) {
                System.out.println(" ★ Tên này đã tồn tại xin nhập tên khác ★");
            } else {
                name = check;
                break;
            }
        }
        int quantity;
        while (true) {
            System.out.println("Nhập số lượng động vật: ");
            System.out.print("\t➺ ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity > 0) {
                    break;
                }
                System.out.println("\t ★ Số lượng phải lớn hơn 0 ★");
                System.out.println();
            } catch (Exception e) {
                System.out.println("\t ★ Số lượng phải là 1 số ★");
                System.out.println();
            }
        }
        long price;
        while (true) {
            System.out.println("Nhập giá động vật: ");
            System.out.print("\t➺ ");
            try {
                price = Long.parseLong(scanner.nextLine());
                if (price > 0) {
                    break;
                }
                System.out.println("\t★ Giá phải lớn hơn 0 ★");
                System.out.println();
            } catch (Exception e) {
                System.out.println("\t★ Giá phải là 1 số ★");
                System.out.println();
            }
        }
        System.out.println("Nhập mô tả động vật: ");
        System.out.print(" \t➺ ");
        String description = scanner.nextLine();
        Status status = Status.INSTOCK;
        Farm farm = new Farm(id, type, name, quantity, price, description, status);
        productService.add(farm);
        System.out.println("✔ Bạn đã thêm động vật thành công ✔\n");
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
        menu.boss();
    }

    public void showProductBoss() {
        List<Farm> farms = productService.getProducts();
        System.out.println("Danh sách động vật : ");
        System.out.println("\t\t\t\t=========================================================================================================================");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-15s %-25s %-25s\n", "ID", "Tên động vật", "Loại động vật", "Số lượng", "Giá", "Trạng thái");
        for (Farm farm : farms) {
            System.out.printf("\t\t\t\t%-10d %-25s %-30s %-15d %-25s %-25s\n", farm.getId(), farm.getName(), farm.getType(), farm.getQuantity(), format.format(farm.getPrice()), farm.getStatus());
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
//        menu.boss();
    }


    public void showProductGuest() {

        List<Farm> farms = productService.getProducts();
        System.out.println("Danh sách động vật");
        System.out.println("\t\t\t\t=========================================================================================================================");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-15s %-25s %-25s\n", "ID", "Tên động vật", "Loại động vật", "Số lượng", "Giá", "Trạng thái");
        for (Farm farm : farms) {
            System.out.printf("\t\t\t\t%-10d %-25s %-30s %-15d %-25s %-25s\n", farm.getId(), farm.getName(), farm.getType(), farm.getQuantity(), format.format(farm.getPrice()), farm.getStatus());
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
        menu.guest();
    }

    public void showProductDescriptionBoss() {
        List<Farm> farms = productService.getProducts();
        System.out.println("lịch sử tiêm vacxin ");
        System.out.println("\t\t\t\t=========================================================================================================================");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-50s\n", "ID", "Tên động vật","Loại động vật", "lịch sử tiêm vacxin");
        for (Farm farm : farms) {
            System.out.printf("\t\t\t\t%-10s %-25s %-30s %-50s\n", farm.getId(), farm.getName() , farm.getType(), farm.getDescription());
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
        menu.boss();
    }

    public void showProductDescriptionGuest() {
        List<Farm> farms = productService.getProducts();
        System.out.println("lịch sử tiêm vacxin ");
        System.out.println("\t\t\t\t=========================================================================================================================");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-50s\n", "ID", "Tên động vật","Loại động vật", "lịch sử tiêm vacxin");
        for (Farm farm : farms) {
            System.out.printf("\t\t\t\t%-10s %-25s %-30s %-50s\n", farm.getId(), farm.getName() , farm.getType(),  farm.getDescription());
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
        menu.guest();
    }


    public void findProductbyTypeGuest() {
        System.out.println("= = = = = = = = = =  ");
        System.out.println("∥   1. bò             ∥");
        System.out.println("∥   2. gà             ∥");
        System.out.println("∥   3. ngựa           ∥");
        System.out.println("∥   4. vịt            ∥");
        System.out.println("∥   5. trâu           ∥");
        System.out.println("∥   6. heo            ∥");
        System.out.println("∥   7. dê             ∥");
        System.out.println("= = = = = = = = = = = ");
        System.out.print("Nhập số tương ứng với loại động vật cần tìm (1-7): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        String type;
        switch (choice) {
            case 1:
                type = "bò";
                break;
            case 2:
                type = "gà";
                break;
            case 3:
                type = "ngựa";
                break;
            case 4:
                type = "vịt";
                break;
            case 5:
                type = "trâu ";
                break;
            case 6:
                type = "heo";
                break;
            case 7:
                type = "dê";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        boolean found = false;
        List<Farm> farms = productService.getProducts();
        System.out.println("Danh sách động vật");
        System.out.println("\t\t\t\t=========================================================================================================================");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-15s %-25s %-25s\n", "ID", "Tên động vật","Loại động vật", "Số lượng", "Giá", "Trạng thái");
        for (Farm farm : farms) {
            if (farm.getType().equalsIgnoreCase(type)){
                System.out.printf("\t\t\t\t%-10d %-25s %-30s %-15d %-25s %-25s\n", farm.getId(), farm.getName(), farm.getType(),  farm.getQuantity(), format.format(farm.getPrice()), farm.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ✖ Không có động vật này ✖");
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
        menu.guest();
    }


    public void findProductbyTypeBoss() {
        System.out.println("= = = = = = = = =  = ");
        System.out.println("∥  1. bò            ∥");
        System.out.println("∥  2. gà            ∥");
        System.out.println("∥  3. ngựa          ∥");
        System.out.println("∥  4. vịt           ∥");
        System.out.println("∥  5. trâu          ∥");
        System.out.println("∥  5. heo           ∥");
        System.out.println("∥  5. dê            ∥");
        System.out.println("= = = = = = = = = = =");
        System.out.print("Nhập số tương ứng với loại động vật cần tìm (1-5): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        String type;
        switch (choice) {
            case 1:
                type = "bò";
                break;
            case 2:
                type = "gà";
                break;
            case 3:
                type = "ngựa";
                break;
            case 4:
                type = "vịt ";
                break;
            case 5:
                type = "trâu";
                break;
            case 6:
                type = "heo ";
                break;
            case 7:
                type = "dê ";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
                return;
        }
        boolean found = false;
        List<Farm> farms = productService.getProducts();
        System.out.println("Danh sách động vật");
        System.out.println("\t\t\t\t=========================================================================================================================");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-15s %-25s %-25s\n", "ID","Tên động vật", "Loại động vật", "Số lượng", "Giá", "Trạng thái");
        for (Farm farm : farms) {
            if (farm.getType().equalsIgnoreCase(type)) {
                System.out.printf("\t\t\t\t%-10d %-25s %-30s %-15d %-25s %-25s\n", farm.getId(), farm.getName(), farm.getType(),  farm.getQuantity(), format.format(farm.getPrice()), farm.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ✖ Không có động vật này ✖");
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n\n");
        menu.boss();
    }

    public void findProductbyNameBoss() {
        System.out.print("Nhập tên động vật cần tìm: ");
        String name = scanner.nextLine().toUpperCase();
        boolean found = false;
        List<Farm> p = productService.getProducts();
        System.out.println("Danh sách động vật");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-15s %-25s %-25s\n", "ID",  "Tên động vật","Loại động vật", "số lượng", "giá", "trạng thái");
        for (Farm farm : p) {
            if (farm.getName().toUpperCase().contains(name)) {
                System.out.printf("\t\t\t\t%-10d %-25s %-30s %-15d %-25s %-25s\n", farm.getId(), farm.getName(), farm.getType(), farm.getQuantity(), format.format(farm.getPrice()), farm.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ✖ Không có động vật này ✖");
        }
        System.out.println("\t\t\t\t=========================================================================================================================");
        menu.boss();
    }

    public void findProductbyNameGuest() {
        System.out.print("Nhập tên động vật cần tìm: ");
        String name = scanner.nextLine().toUpperCase();
        boolean found = false;
        List<Farm> p = productService.getProducts();
        System.out.println("Danh sách động vật");
        System.out.printf("\t\t\t\t%-10s %-25s %-30s %-15s %-25s %-25s\n", "ID","Tên động vật", "Loại động vật", "Số lượng", "Giá", "Trạng thái");
        for (Farm farm : p) {
            if (farm.getName().toUpperCase().contains(name)) {
                System.out.println("\t\t\t\t=========================================================================================================================\n");
                System.out.printf("\t\t\t\t%-10d %-25s %-30s %-15d %-25s %-25s\n", farm.getId(), farm.getName() , farm.getType(),  farm.getQuantity(), format.format(farm.getPrice()), farm.getStatus());
                found = true;
            }
        }
        if (!found) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t ✖ Không có động vật này ✖");
        }
        System.out.println("\t\t\t\t=========================================================================================================================\n");
        menu.guest();
    }

    public void updateProduct() {
        int id = 0;
        Farm update = null;
        while (true) {
            System.out.println("Nhập ID động vật cần sửa");
            System.out.print("\t➺ ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0) {
                    if (productService.existProduct(id)) {
                        update = productService.findProductbyID(id);
                        break;
                    } else {
                        System.out.println("  ★ ID này không tồn tại  ★");
                    }
                } else {
                    System.out.println("\t  ★ ID phải lớn hơn 0  ★");
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("\t  ★ ID phải là 1 số  ★");
                System.out.println();
            }
        }
        noChange();
        setPType(update);
        noChange();
        while (true) {
            System.out.println("Nhập tên động vật cần sửa");
            System.out.print("\t➺ ");
            String name = scanner.nextLine();
            if (!name.equals("-1")) {
                if (productService.existProductName(name)) {
                    System.out.println("★ Tên này đã tồn tại xin nhập tên khác ★");
                } else {
                    update.setName(name);
                    break;
                }
            } else {
                break;
            }
        }
        noChange();
        while (true) {
            System.out.println("Nhập số lượng động vật: ");
            System.out.print("\t➺ ");
            try {
                int quantity = Integer.parseInt(scanner.nextLine());
                if (!(quantity == -1)) {
                    if (quantity >= 0) {
                        update.setQuantity(quantity);
                        break;
                    }
                    System.out.println("\t  ★ Số lượng phải lớn hơn 0  ★");
                    System.out.println();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("\t  ★ Số lượng phải là 1 số  ★");
                System.out.println();
            }
        }
        noChange();
        while (true) {
            System.out.println("Nhập giá động vật: ");
            System.out.print("\t➺ ");
            try {
                long price = Long.parseLong(scanner.nextLine());
                if (!(price == -1)) {
                    if (price >= 0) {
                        update.setPrice(price);
                        break;
                    }
                    System.out.println("\t  ★ Giá phải lớn hơn 0  ★");
                    System.out.println();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("\t  ★ Giá phải là 1 số  ★");
                System.out.println();
            }
        }
        noChange();
        while (true) {
            System.out.println("lịch sử tiêm vacxin: ");
            System.out.print(" \t➺ ");
            String description = scanner.nextLine();
            if (!(description.equals("-1"))) {
                update.setDescription(description);
                break;
            } else {
                break;
            }
        }
        productService.update(id, update);
        System.out.println("✔ Bạn đã cập nhật động vật thành công ✔\n");
        System.out.println("\t\t\t\t=========================================================================================================================");
        productService.checkExist();
        menu.boss();
    }


    public void setPType(Farm farm) {
        System.out.println("=     = SET TYPE =  =");
        System.out.println("∥   1. bò           ∥");
        System.out.println("∥   2. gà           ∥");
        System.out.println("∥   3. ngựa         ∥");
        System.out.println("∥   4. vịt          ∥");
        System.out.println("∥   5. trâu         ∥");
        System.out.println("∥   6. heo          ∥");
        System.out.println("∥   7. dê           ∥");
        System.out.println("= = = = = = = = = =  ");
        System.out.println("Chọn Role: ");
        System.out.print("\t➺ ");
        int options;
        try {
            options = Integer.parseInt(scanner.nextLine());
            switch (options) {
                case -1:
                    break;
                case 1:
                    farm.setType(PType.bò);
                    break;
                case 2:
                    farm.setType(PType.gà);
                    break;
                case 3:
                    farm.setType(PType.ngựa );
                    break;
                case 4:
                    farm.setType(PType.vịt );
                    break;
                case 5:
                    farm.setType(PType.trâu);
                    break;
                case 6:
                    farm.setType(PType.heo );
                    break;
                case 7:
                    farm.setType(PType.dê );
                    break;
                default:
                    System.out.println("Nhập không đúng! Vui lòng nhập lại");
                    setPType(farm);
            }
        } catch (Exception e) {
            System.out.println("\t  ★ Lựa chọn phải là 1 số  ★");
            System.out.println("\t=========================");
            setPType(farm);
        }
    }


    public void setStatus(Farm farm) {
        System.out.println("=       = SET STATUS =     =");
        System.out.println("∥   1. IN STOCK            ∥");
        System.out.println("∥   2. OUT OF STOCK        ∥");
        System.out.println("= = = = = = = = = = = = = = ");
        System.out.println("Chọn Status: ");
        System.out.print(" ⭆ ");
        int options;
        try {
            options = Integer.parseInt(scanner.nextLine());
            switch (options) {
                case -1:
                    break;
                case 1:
                    farm.setStatus(Status.INSTOCK);
                    break;
                case 2:
                    farm.setStatus(Status.OUTOFSTOCK);
                    break;
                default:
                    System.out.println("Nhập không đúng! Vui lòng nhập lại");
                    setStatus(farm);
            }

        } catch (Exception e) {
            System.out.println("\t  ★ Lựa chọn phải là 1 số  ★");
            System.out.println("\t=========================");
            setStatus(farm);
        }

    }

    public void noChange() {
        System.out.println(" ⦿ Nếu không thay đổi gì thì nhập: -1 ⦿ ");
    }
}
