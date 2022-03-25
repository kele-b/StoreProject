public class Shoe extends Product{

    int size;

    public Shoe(String name, String brand, double price, String color, int size){
        super(name, brand, price, color);
        if(isValidShoeSize(size))
            this.size=size;
        else
            try {
                throw new Exception("Not valid shoe size!");
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
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
