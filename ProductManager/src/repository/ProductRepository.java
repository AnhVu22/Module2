package repository;

import model.Product;

import java.util.ArrayList;
import java.util.Objects;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, "Laptop","PC", 5000));
        productList.add(new Product(2, "PC","Desktop", 10000));
    }
    @Override
    public ArrayList<Product> getAll() {
        return productList;
    }
    @Override
    public void add(Product product) {
        productList.add(product);
    }
    @Override
    public void delete(int deleteId) {
        for (int i = 0; i < productList.size(); i++) {
            if (deleteId == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }
    }
    @Override
    public void edit(int editId, Product product) {
        for (int i = 0; i < productList.size() ; i++) {
            if (editId == productList.get(i).getId()) {
                productList.set(editId, product);
                break;
            }
        }
    }
    @Override
    public void search(String nameProduct) {
        for (int i = 0; i < productList.size(); i++) {
            if (Objects.equals(nameProduct, productList.get(i).getName())) {
                System.out.println(productList.get(i));
                break;
            }
        }
    }
//    @Override
//    public void search(String nameProduct) {
//        for (int i = 0; i < productList.size(); i++) {
//            if (productList.contains(nameProduct)) {
//                System.out.println(productList.get(i).getName());
//            }
//        }
//    }
}
