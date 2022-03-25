import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;
    private double subTotal;

    //Default constuctor, making empty ArrayList of products
    public Cart(){
        products=new ArrayList<>();
    }

    //Constructor who accepts unlimited number of products
    //Immediately adding them to ArrayList of products
    //Counting total price of all products without discount
    public Cart(Product... products){
        this.products=new ArrayList<>();
        for(Product p : products){
            addProductToCart(p);
        }
    }

    //Method for adding products to ArrayList of products
    public void addProductToCart(Product product){
        this.products.add(product);
        this.subTotal+=product.getPrice();
    }

    //Printing the contents of the cart
    @Override
    public String toString(){
        String allProducts="";
        for(Product p : this.products){
            allProducts+=p+"\n";
        }
        return allProducts;
    }

    //Return ArrayList of products
    public ArrayList<Product> getProducts() {
        return products;
    }
    //Return total price of all products in cart
    public double getSubTotal() {
        return subTotal;
    }
}
