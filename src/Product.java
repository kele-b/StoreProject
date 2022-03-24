public abstract class  Product {

    String name;
    String brand;
    double price;
    String color;


    public Product(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    //protected abstract boolean checkingSizeStandard( Object size);

    @Override
    public String toString(){
        return "Name: "+this.name+"\n Brand: "+this.brand+"\n Price: "+this.price+"\n Color: "+this.color;
    }
}
