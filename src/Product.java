public abstract class  Product {

    private String name;
    private String brand;
    private double price;
    private String color;
    private int discountPercent;        //Discount in percent



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

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    //Return double value of discount and round it
    public double getDiscountPrice(){
        double discountPercent = price * this.discountPercent / 100;
        return Math.round(discountPercent*100.0)/100.0;
    }
}
