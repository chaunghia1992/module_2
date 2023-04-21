package product1.services;

import product1.model.Farm;
import product1.model.Status;
import product1.utils.CSVUtils;
import java.util.ArrayList;
import java.util.List;

public class ProductService implements IProductService{
    List<Farm> farmList = new ArrayList<>();
    public static  String path = "src\\data\\product.csv";

    @Override
    public void add(Farm newFarm){
        farmList.add(newFarm);
        CSVUtils.write(path, farmList);
    }

    @Override
    public void update(int id, Farm updateFarm) {
        getProducts();
        for (int i = 0; i < farmList.size(); i++) {
            if(farmList.get(i).getId() == id){
                farmList.set(i, updateFarm);
                CSVUtils.write(path, farmList);
            }
        }
    }

    @Override
    public List<Farm> getProducts() {
        List<Farm> newFarmList = new ArrayList<>();
        List<String> reads = CSVUtils.read(path);
        for (String read:reads) {
            newFarmList.add(new Farm(read));
        }
        return farmList = newFarmList;
    }

    @Override
    public void updateQuantity(int id, int quantity) {
        getProducts();
        for (int i = 0; i < farmList.size(); i++) {
            if(farmList.get(i).getId() == id){
                farmList.get(i).setQuantity(quantity);
                CSVUtils.write(path, farmList);
            }
        }
    }

    public int getQuantity(int id) {
        getProducts();
        int soluong = 0;
        for (Farm farm : farmList) {
            if (farm.getId() == id) {
                soluong = farm.getQuantity();
            }
        }
        return soluong;
    }

    public boolean existProduct(int id){
        getProducts();
        for (Farm farm : farmList) {
            if (farm.getId() == id){
                return true;
            }
        }
        return false;
    }

    public boolean existProductName(String name){
        getProducts();
        for (Farm farm : farmList) {
            if (farm.getName().equals(name)){
                return true;
            }
        }
        return false;
    }


    public Farm findProductbyID(int id){
        getProducts();
        for (Farm farm : farmList) {
            if (farm.getId() == id){
                return farm;
            }
        }
        System.out.println("\t\t\t\tChưa lớn kịp để xuất chuồn");
        return null;
    }


    public void checkExist (){
        getProducts();
        for (Farm p : farmList) {
            if (p.getQuantity() == 0){
                p.setStatus(Status.OUTOFSTOCK);
                CSVUtils.write(path, farmList);
            } else {
                p.setStatus(Status.INSTOCK);
                CSVUtils.write(path, farmList);
            }
        }
    }
}