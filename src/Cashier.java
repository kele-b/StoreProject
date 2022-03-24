import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Cashier {

    private double subTotal;
    private double totalDiscount;
    private double total;

    public void printReceipt(ArrayList<Product> products, String dateTime){
        String productsToPrint = "";
        for(Product p : products){

            //In case that is more then 3 products to purchase and its thuesday
            if((products.size()>=3)
                   && stringToDateTime(dateTime).getDayOfWeek().equals(DayOfWeek.TUESDAY)){
                if(p.getClass().equals(Shoes.class))
                    p.setDiscountP(25);
                else
                    p.setDiscountP(20);
            }

            //in case that is more then 3 products, regardless of the day
            else if(products.size()>=3){
                p.setDiscountP(20);
            }

            //In case that is less then 3 products and its thuesday
            else if(stringToDateTime(dateTime).getDayOfWeek().equals(DayOfWeek.TUESDAY)){
                if(p.getClass().equals(Shirts.class))
                    p.setDiscountP(10);
                if(p.getClass().equals(Shoes.class))
                    p.setDiscountP(25);
            }

            //Concatenating all informations for each product
            productsToPrint+=(p.getName()+"-"+p.getBrand()+"\n"+p.getPrice()+"\n#discount "+p.getDiscountP()+"% - $"
                    +p.getDiscountPrice()+"\n\n");


            subTotal+=p.getPrice();     //amount of all product prices
            totalDiscount+=p.getDiscountPrice();        //amount of all product discounts

        }
        total=subTotal-totalDiscount;       //total price with discount

        //Concatenating all informations to String to be printed
        System.out.println("Date: "+dateTime+"\n---Products---\n\n"+productsToPrint
                +"---------------------------------\n\nSUBTOTAL: $"+subTotal
                +"\nDISCOUNT: -$"+totalDiscount+"\n\nTOTAL: $"+total+"\n\n");
    }

    // Converting from String to LocalDateTime
    private LocalDateTime stringToDateTime(String dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime,formatter);
        return localDateTime;
    }

}
