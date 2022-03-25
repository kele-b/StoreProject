import java.text.DecimalFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Cashier {

    private double totalDiscount;
    private double total;

    //String where all products will be concatenaded
    private String productsToPrint ="";

    // Converting from String type to LocalDateTime type
    private static LocalDateTime stringToDateTime(String dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime,formatter);
        return localDateTime;
    }

    //Calculating total amount of all products with discount
    //Discount depend of number of item in cart and data (day in week)
    private void calculateAmountOfCart(Cart cart, String dateTime){
        boolean isDayOfWeekThuesday = stringToDateTime(dateTime).getDayOfWeek().equals(DayOfWeek.TUESDAY);
        boolean isMoreThenThreeProducts = cart.getProducts().size()>=3;

        for(Product p : cart.getProducts()){

            //In case that is more then 3 products to purchase and its thuesday
            if(isMoreThenThreeProducts && isDayOfWeekThuesday){
                if(p.getClass().equals(Shoe.class))
                    p.setDiscountPercent(25);
                else
                    p.setDiscountPercent(20);
            }

            //in case that is more then 3 products, regardless of the day
            else if(isMoreThenThreeProducts){
                p.setDiscountPercent(20);
            }

            //In case that is less then 3 products and its thuesday
            else if(isDayOfWeekThuesday){
                if(p.getClass().equals(Shirt.class))
                    p.setDiscountPercent(10);
                if(p.getClass().equals(Shoe.class))
                    p.setDiscountPercent(25);
            }

            totalDiscount+=p.getDiscountPrice();        //amount of all product discounts
        }
        total= cart.getSubTotal()-totalDiscount;       //total price with discount
    }

    public void printReceipt(Cart cart, String dateTime){
        double totalDiscount;
        double total;
        calculateAmountOfCart(cart,dateTime);

        //Concatenating all informations for each product to String
        for(Product p : cart.getProducts()){
            productsToPrint+=(p.getName()+"-"+p.getBrand()+"\n"+p.getPrice()+"\n#discount "+p.getDiscountPercent()+"% - $"
                    +roundDouble(p.getDiscountPrice())+"\n\n");
        }
        //Concatenating all informations off products and receipt price amount to String
        System.out.println("Date: "+dateTime+"\n\n---Products---\n\n"+productsToPrint
                +"---------------------------------\n\nSUBTOTAL: $"+cart.getSubTotal()
                +"\nDISCOUNT: -$"+roundDouble(this.totalDiscount)+"\n\nTOTAL: $"+roundDouble(this.total)+"\n\n");

    }

    //Return String of round double values in format x.xx
    private static String roundDouble(double value){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(value);
    }


}
