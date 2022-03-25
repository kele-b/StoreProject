public class Trouser extends Product{

    int size;

    public Trouser(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        if(isValidTrouserSize(size)){
            this.size=size;
        }
        else
            try {
                throw new Exception("Not valid trouser size!");
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
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
