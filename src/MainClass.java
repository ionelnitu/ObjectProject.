import storepackage.*;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("\n");
        Product vin= new Product("Aliment",50,15985);
        System.out.println(vin.getInfo());
        System.out.println("\n");
        Chocolate milka=new Chocolate("Milka",60,1558,3);
        System.out.println(milka.getInfo());
        System.out.println("\n");
        Wine alb= new Wine("Beciul Domnesc",60,565847,0.700);
        System.out.println(alb.getInfo());
    }
}
