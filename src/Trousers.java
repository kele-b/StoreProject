public class Trousers extends Product{

    int size;

    public Trousers(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        if(isValidTrouserSize(size)){
            this.size=size;
        }
        else
            throw new IllegalArgumentException("Invalid trousers size!");
    }

    private static boolean isValidTrouserSize(int size){
        if((size>=42 && size<=66) && size%2==0)
            return true;
        else
            return false;
    }

    @Override
    public String toString(){
        return "Trouser:\n "+super.toString()+"\n Size: "+this.size;
    }
}
