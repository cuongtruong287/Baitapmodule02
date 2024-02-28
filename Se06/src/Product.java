import java.util.Scanner;

public class Product {
    private String productID;
    private String productName;
    private Float productCost;
    private Float productPrice;

    public Product() {
    }

    public Product(String productID, String productName, float productPrice, float productCost) {
        this.productID = productID;
        this.productName = productName;
        this.productCost = productCost;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getProductCost() {
        return productCost;
    }

    public void setProductCost(Float productCost) {
        this.productCost = productCost;
    }

    public Float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Float productPrice) {
        this.productPrice = productPrice;
    }

    public void enterInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap cac thong tin san pham sau day:");
        System.out.println("Ten san pham:");
        productName = scanner.nextLine();
        System.out.println("Ma san pham");
        productID = scanner.nextLine();
        System.out.println("Gia mua vao");
        productCost = scanner.nextFloat();
        System.out.println("Gia ban ra");
        productPrice = scanner.nextFloat();
    }

    public void showInfo() {
        System.out.println("Ten san pham: " + productName);
        System.out.println("Ma san pham: " + productID);
        System.out.println("Gia mua vao: " + productCost + "$");
        System.out.println("Gia ban ra: " + productPrice + "$");
    }

    public void interestRate() {
        Float rate = productPrice/productCost;
        System.out.println("Lai suat la: " + (rate-1)*100 + "%");
    }

}