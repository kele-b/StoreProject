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

        Cashier cashier = new Cashier(n,shoes,jacket,trousers,shirts);
        System.out.println(cashier);
    }
}
