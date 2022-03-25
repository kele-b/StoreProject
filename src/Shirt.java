public class Shirt extends Product{

    String size;
    private static final String sizes[] = {"XS","S","M","L","XL","2XL"};

    public Shirt(String name, String brand, double price, String color, String size) {
        super(name,brand,price,color);
        if(isValidShirtSize(size))
            this.size=size.toUpperCase();
        else
            throw new IllegalArgumentException("Invalid shirt size!");
    }


    private static boolean isValidShirtSize(String size){
        for(String s : sizes){
           if(s.equals(size.toUpperCase())) {
               return true;
           }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Shirt:\n "+super.toString() + "\n Size: "+this.size;
    }


}
