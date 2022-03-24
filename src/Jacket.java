public class Jacket  extends Product{

    int size;

    public Jacket(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        if(checkingSizeStandard(size)){
            this.size=size;
        }
        else
            System.out.println("Entered wrong size!");
    }
    private boolean checkingSizeStandard(int size){
        for(int i = 42; i<=66; i++){
            if(i==size){
                return true;
            }
            i++;
        }
        return false;
    }
    @Override
    public String toString(){
        return "Jacket:\n "+super.toString()+"\n Size: "+this.size;
    }
}
