package view;

import controller.ProductController;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);
    private static final int DISPLAY = 1;
    private static final int ADD = 2;
    private static final int DELETE = 3;
    private static final int UPDATE = 4;
    private static final int SEARCH = 5;
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng:\n" +
                    "1.Hiển thị danh sách sản phẩm\n" +
                    "2.Thêm mới sản phẩm\n" +
                    "3.Xóa sản phẩm\n" +
                    "4.Chỉnh sửa sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm\n" +
                    "6.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case DISPLAY:
                    display();
                    break;
                case ADD:
                    Product product = inputDataProduct();
                    productController.add(product);
                    System.out.println("Thêm mới thành công");
                    break;
                case DELETE:
                    delete();
                    System.out.println("Xóa thành công");
                    break;
                case UPDATE:
                    edit();
                    System.out.println("Đã chỉnh sửa");
                    break;
                case SEARCH:
                    search();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
    // method display
    public static void display () {
        ArrayList<Product> products = productController.getAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }
    // method input
    public static Product inputDataProduct() {
        System.out.println("Nhập Id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả sản phẩm: ");
        String description = scanner.nextLine();
        Product products = new Product(id, name, description, price);
        return products;
    }
    // delete method
    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id cần xóa: ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productController.delete(deleteId);
    }
    //update method
    public static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id cần sửa: ");
        int editId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập thông tin đối tượng cần sửa: ");
        Product product = inputDataProduct();
        productController.edit(editId,product);
    }
    // search method
    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();
        productController.search(nameProduct);
    }
}
