public class Shoes extends Product{

    int size;

    public Shoes(String name, String brand, double price, String color, int size)  {
        super(name, brand, price, color);
        if(isValidShoeSize(size))
            this.size=size;
        else
            throw new IllegalArgumentException("Invalid shoes size!");
    }

    private static boolean isValidShoeSize(int size){
        if(size>=39 && size<=46)
            return true;
        else
            return false;
    }
    @Override
    public String toString(){
        return "Shoe:\n "+super.toString()+"\n Size: "+this.size;
    }
}
