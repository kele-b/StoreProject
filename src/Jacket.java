public class Jacket  extends Product{

    int size;

    public Jacket(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        if(isValidJacketSize(size)){
            this.size=size;
        }
        else
            throw new IllegalArgumentException("Invalid jacket size!");
    }
    private static boolean isValidJacketSize(int size){
        if((size>=42 && size<=66) && size%2==0)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        return "Jacket:\n "+super.toString()+"\n Size: "+this.size;
    }
}
