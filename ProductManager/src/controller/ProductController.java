package controller;

import model.Product;
import services.impl.ProductServices;

import java.util.ArrayList;

public class ProductController {
    public static ProductServices productServices = new ProductServices();
    public ArrayList<Product> getAll() {
        return productServices.getAll();
    }
    public void add (Product product) {
        productServices.add(product);
    }
    public void delete (int deleteId) {
        productServices.delete(deleteId);
    }
    public void edit(int editId, Product product) {
        productServices.edit(editId,product);
    }
    public void search(String nameProduct) {
        productServices.search(nameProduct);
    }
}
