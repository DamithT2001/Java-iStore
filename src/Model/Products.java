package Model;

public class Products {

    private String productId;
    private String productName;
    private String productCat;
    private String price;

    public Products(String productId, String productName, String productCat, String price) {
        this.productId = productId;
        this.productName = productName;
        this.productCat = productCat;
        this.price = price;
    }

    // Get & Set Methods (Encapsulation)
    
    public String getProductId() {
        return productId;
    }

    public void setProductId() {
        this.productId = productId;
    }

    public String getProduct() {
        return productName;
    }

    public void setProduct(String productName) {
        this.productName = productName;
    }

    public String getProductCat() {
        return productCat;
    }

    public void setProductCat(String productCat) {
        this.productCat = productCat;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
