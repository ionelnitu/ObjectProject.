package storepackage;

public class Chocolate extends Product {
    public double weight;

    public Chocolate() {

    }

    public Chocolate(String name, double price, int barCode, double weight) {
        super(name, price, barCode);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Weight:" + this.weight;
    }
}
