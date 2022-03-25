public class Trousers extends Product{

    int size;

    public Trousers(String name, String brand, double price, String color, int size) {
        super(name, brand, price, color);
        if(checkingSizeStandard(size)){
            this.size=size;
        }
        else
            // to do - trow exception
            System.out.println("Entered wrong size!");
    }

    private boolean checkingSizeStandard(int size){
        for(int i = 42; i<=66; i+=2){
            if(i==size){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        return "Trouser:\n "+super.toString()+"\n Size: "+this.size;
    }
}
