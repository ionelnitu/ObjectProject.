package storepackage;

public class Product {
    public String name;
    public int barCode;
    public double price;
    public static final double taxe = 1.2;

    public Product() {

    }

    public Product(String name, double price, int barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public double taxe() {
        return this.price + (this.price * taxe);
    }

    public String getInfo() {
        return "Name:" + this.name + "\n" +
                "Price:" + taxe() + "\n" +
                "BarCode:" + this.barCode;
    }
}
