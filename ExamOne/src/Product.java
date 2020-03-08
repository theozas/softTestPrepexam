public class Product implements PrintMy {

    private int productNo;
    private String description;
    private double price;
    private int stock;

    public Product() {
        productNo = 0;
        description = "";
        price = 0;
        stock = 0;
    }

    public Product(int productNo, String description, double price, int stock) {
        this.productNo = productNo;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getProductNo() {
        return productNo;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setProductNo(int productNo) {
        this.productNo = productNo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "\nProduct No: " + productNo +",\nDescription: " + description +",\nPrice: " + price +"$"+   ",\nIn Stock: " + stock +
                "\n*******************************************************";
    }
}
