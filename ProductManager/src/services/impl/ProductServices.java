package services.impl;

import model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.util.ArrayList;

public class ProductServices implements IProductServices {
    // khai báo Repo
    private final IProductRepository productRepository = new ProductRepository();
    @Override
    public ArrayList<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }
    @Override
    public void delete(int deleteId) {
        productRepository.delete(deleteId);
    }
    @Override
    public void edit(int editId, Product product) {
        productRepository.edit(editId, product);
    }
    @Override
    public void search(String nameProduct) {
        productRepository.search(nameProduct);
    }
}
