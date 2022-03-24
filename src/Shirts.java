public class Shirts extends Product{

    String size;
    static final String sizes[] = {"XS","S","M","L","XL","2XL"};

    public Shirts(String name, String brand, double price, String color, String size){
        super(name,brand,price,color);
        if(checkingSizeStandard(size))
            this.size=size.toUpperCase();
        else
            System.out.println("Entered wrong size!");

    }


    private boolean checkingSizeStandard(String size){
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
