public class Shoes extends Product{

    int size;

    public Shoes(String name, String brand, double price, String color, int size){
        super(name, brand, price, color);
        if(checkingSizeStandard(size))
            this.size=size;
        else
            System.out.println("Entered wrong size!");

    }

    private boolean checkingSizeStandard(int size){
        for(int i = 39; i<=46; i++){
            if(size==i){
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString(){
        return "Shoe:\n "+super.toString()+"\n Size: "+this.size;
    }
}
