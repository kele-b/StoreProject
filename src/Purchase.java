import java.util.ArrayList;

public class Purchase {

    public static void main(String[] args) {

        //Example #1
        Shirts shirt1 = new Shirts("Blue Cotton Shirt", "BrandS",14.99,"blue","M");
        Shirts shirt2 = new Shirts("White Cotton Shirt","BrandS",15.99,"white","M");
        Trousers trousers1 = new Trousers("Black Cotton Trousers","BrandT",29.99, "black",50);
        Shoes shoes1 = new Shoes("Black Leather Shoes", "BrandS",59.99,"black",43);
        Jacket jacket1 = new Jacket("Black Cotton Suit Jacket","BrandJ",99.99,"black",50);


        Cart cart1 = new Cart(shirt1,shirt2,shoes1,jacket1,trousers1);

        String dateTime1 = "2022-02-02 12:34:56";

        Cashier cashier1 = new Cashier();
        cashier1.printReceipt(cart1,dateTime1);


        //Example #2
        Product shirt3 = new Shirts("Blue Cotton Shirt","BrandS",29.99,"black","L");
        Product shirt4 = new Shirts("White Cotton Shirt","BrandS",29.99,"black","M");

        Cart cart2 = new Cart();
        cart2.addProductToCart(shirt3);
        cart2.addProductToCart(shirt4);

        String dateTime2 = "2022-02-01 12:34:56";

        Cashier cashier2 = new Cashier();
        cashier2.printReceipt(cart2,dateTime2);


        //Example #3
        Trousers trousers2 = new Trousers("Red Linen Trousers","BrandT",49.99, "red",56);
        Shoes shoes2 = new Shoes("Red Suede Shoes", "BrandS",59.99,"red",44);
        Shoes shoes3 = new Shoes("Black Suede Shoes", "BrandS",59.99,"black",44);
        Jacket jacket2 = new Jacket("Red Linen Suit Jacket","BrandJ",99.99,"red",56);
        Shirts shirt5 = new Shirts("White Linen Shirt","BrandS",29.99,"white","l");

        Cart cart3 = new Cart(trousers2,shoes2,shoes3,jacket2,shirt5);

        String dateTime3 = "2022-02-01 12:34:56";

        Cashier cashier3 = new Cashier();
        cashier3.printReceipt(cart3,dateTime3);





    }
}
