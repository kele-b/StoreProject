import java.util.ArrayList;

public class Purchase {

    public static void main(String[] args) {
        Shirts n = new Shirts("Blue Cotton Shirt", "BrandS",14.99,"blue","M");
        //System.out.println(n);
        Shoes shoes = new Shoes("Black Leather Shoes", "BrandS",29.99,"black",43);
        //System.out.println(shoes);
        Jacket jacket = new Jacket("Black Cotton Suit Jacket","BrandJ",59.99,"black",50);
        //System.out.println(jacket);
        Trousers trousers = new Trousers("Black Cotton Trousers","BrandT",99.99, "black",50);
        //System.out.println(trousers);
        Shirts shirts = new Shirts("White Cotton Shirt","BrandS",15.99,"black","L");

        ArrayList<Product> products = new ArrayList<>();
        products.add(n);
        products.add(shoes);
        products.add(jacket);
        products.add(shirts);
        products.add(trousers);

        Cashier c = new Cashier();

        String dateTime = "2022-02-02 12:34:56";

        c.printReceipt(products,dateTime);

        Product shirts1 = new Shirts("Blue Cotton Shirt","BrandS",29.99,"black","L");
        Product shirts2 = new Shirts("White Cotton Shirt","BrandS",29.99,"black","M");
        ArrayList<Product> products1 = new ArrayList<>();
        products1.add(shirts1);
        products1.add(shirts2);
        String dt = "2022-02-02 12:34:56";
        Cashier cashier = new Cashier();
        cashier.printReceipt(products1,dt);

    }
}
