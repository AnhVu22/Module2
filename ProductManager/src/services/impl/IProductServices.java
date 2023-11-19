package services.impl;

import model.Product;

import java.util.ArrayList;

public interface IProductServices {
    ArrayList<Product> getAll();
    void add(Product product);
    void delete(int deleteId);
    void edit(int editId, Product product);
    void search(String nameProduct);
}
