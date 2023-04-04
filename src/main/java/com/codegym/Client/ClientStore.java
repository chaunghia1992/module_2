package com.codegym.Client;

import java.util.*;

public class ClientStore {
    static List<Client> client1;
    private static final Scanner scanner = new Scanner(System.in);

    public ClientStore() {
        client1 = new ArrayList<>();
        Client client;

        client = new Client(1L, "văn nghĩa", "vannghia@gmail.com....","Hue", new Date());
        client1.add(client);
        client1.add(new Client(2L, "quốc đạt", "quocđat@gmail.com....","hue", new Date()));
        client1.add(new Client(3L, "quang hiếu", "quanghieu@gmail.com....", "hue",new Date()));
        client1.add(new Client(19L, "hân hoàn", "hanhoan@gmail.com...", "hue",new Date()));
        client1.add(new Client(5L, "công bằng", "congbang@gmail.com....", "hue",new Date()));
        client1.add(new Client(6L, "thanh thiện", "thanhthien@gmail.com....", "hue",new Date()));
    }

    public static void showclient() {
        System.out.printf("%5s | %30s | %20s | %30s | %10s \n", "ID", "Name", "Email", "adress", "date");
        for (Client client : client1) {
            System.out.printf("%5s | %30s | %20s | %30s | %10s \n",
                    client.getId(), client.getName(), client.getEmail(),client.getAddress(),client.getEntryDate());


        }

    }
    public static void showclient(List<Client> client1) {
        System.out.printf("%5s | %30s | %20s | %30s | %10s \n", "ID", "Name", "Description", "Date", "gmail");
        for (Client client : client1) {
            System.out.printf("%5s | %30s | %20s | %30s | %10s \n"
                    ,client.getId(), client.getName(), client.getEmail(),client.getAddress(),client.getEntryDate());



        }

    }

    public void addclient() {
        System.out.println("Nhập thông tin danh sách:");
        System.out.println("Nhập tên danh sách : ");
        String name = scanner.nextLine();
        System.out.println("Nhập Email : ");
        String Email = scanner.nextLine();
        System.out.println("Nhập adress : ");
        String adress = scanner.nextLine();


        Client client = new Client();
        long maxId = 0;
        client.setId(maxId + 1);
        client.setName(name);
        client.setEmail(Email);
        client.setAddress(adress);
        client.setEntryDate(new Date());

        client1.add(client);

        showclient();


    }

    public void editclient() {
        System.out.println("Nhập ID bạn muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());

        System.out.println("Nhập tên mới: ");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập Email : ");
        String Email = scanner.nextLine();
        System.out.println("Nhập adress : ");
        String adress = scanner.nextLine();

        for (Client client : client1) {
            if (id == client.getId()) {
                client.setName(nameNew);
                client.setEmail(Email);
                client.setAddress(adress);
            }
        }
        showclient();
    }
    public void deleteclient1() {
        System.out.println("Nhập khách hàng bạn muốn xóa: ");
        long id = Long.parseLong(scanner.nextLine());

        for (int i = 0; i < client1.size(); i++) {
            if (id == client1.get(i).getId()) {
                client1.remove(i);
            }
        }
        showclient();
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ClientStore clientStore = new ClientStore();
        boolean checkActionMenu = true;
        do {
            System.out.println("Menu quản lý khách hàng: ");
            System.out.println("Nhấn 1. Xem danh sách");
            System.out.println("Nhấn 2. Thêm khách hàng");
            System.out.println("Nhấn 3. Sửa khách hàng");
            System.out.println("Nhấn 4. Xóa khách hàng");
            System.out.println("Nhấn 6. Sắp xếp khách hàng theo tên ");
            System.out.println("Nhấn 7. Tìm kiếm khách hàng theo tên");
            System.out.println("Nhấn 8. Tìm kiếm khách hàng theo tên hoặc mail ");
            int actionMenu = Integer.parseInt(scan.nextLine());
            switch (actionMenu) {
                case 1 -> {

                    clientStore.showclient();
                }
                case 2 -> clientStore.addclient();
                case 3 -> clientStore.editclient();
                case 4 -> clientStore.deleteclient1();
                case 5 -> sortByName();
                case 6 -> searchByName();
                default -> System.out.println("Nhập sai rồi bạn ơi! Vui lòng nhập lại");
            }
            boolean checkActionMenuContinue = true;
            do {
                System.out.println("Bạn có muốn tiếp tục hay không: Y/N");
                String actionMenuContinue = scan.nextLine();
                switch (actionMenuContinue) {
                    case "Y" -> {
                        checkActionMenuContinue = false;
                    }
                    case "N" -> {
                        checkActionMenu = false;
                        checkActionMenuContinue = false;
                    }
                    default -> {
                    }
                }
            } while (checkActionMenuContinue);

        } while (checkActionMenu);

    }


    private static void showclient1() {

    }

    private static void searchByName() {
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String kw = scanner.nextLine();
        List<Client> results = new ArrayList<>();
        for (Client client : client1) {
            if (client.getName().contains(kw)) {
                results.add(client);
            }
        }
        showclient1();
    }

    private static void sortByName() {
        client1.sort(new ComparatorByName());
        showclient();
    }

}

