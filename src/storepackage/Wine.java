package storepackage;

public class Wine extends Product {
    public double volume;
    public static final double wineTaxe = 1.32;


    public double taxe() {
        return this.price + (this.price * wineTaxe);
    }

    public Wine() {

    }

    public Wine(String name, double price, int barCode, double volume) {
        super(name, price, barCode);
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Volume" + this.volume + " " + "ml";
    }
}
