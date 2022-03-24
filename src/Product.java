public abstract class  Product {

    private String name;
    private String brand;
    private double price;
    private String color;
    private int discountP;



    public Product(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Name: "+this.name+"\n Brand: "+this.brand+"\n Price: "+this.price+"\n Color: "+this.color;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getDiscountP() {
        return discountP;
    }

    public void setDiscountP(int discountP) {
        this.discountP = discountP;
    }

    public double getDiscountPrice(){
        return price*discountP/100;
    }
}
