public class Toys extends Product implements PrintMy{

    private String type;
    private String brand;
    private String model;
    private int ageSet;
    private String material;

    public Toys() {
        type = "NULL";
        brand = "NULL";
        model = "NULL";
        ageSet = 0;
        material = "NULL";
    }

    public Toys(int productNo, String description, double price, int stock, String type, String brand, String model, int ageSet, String material) {
        super(productNo, description, price, stock);
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.ageSet = ageSet;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAgeSet() {
        return ageSet;
    }

    public void setAgeSet(int ageSet) {
        this.ageSet = ageSet;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return type +":\nBrand: " + brand +",\nModel: " + model +",\nAge Set: " + ageSet +",\nMaterial: " + material + super.toString();
    }
}
