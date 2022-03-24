import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;

public class Cashier {

    private ArrayList<Product> cartOfProducts;
    private LocalDateTime dateTime;
    private double subTotal;
    private int discount;
    private double total;

    public Cashier(Product... products){
        this.cartOfProducts=new ArrayList<>();
        for(Product p : products){
            this.cartOfProducts.add(p);
            subTotal+=p.price;
        }
        dateTime = LocalDateTime.now();
        discount=20;
        total=subTotal-(subTotal*discount/100);
    }

    private String allProducts(){
        String products = "";
        for(Product p:cartOfProducts){
            products+=(p.name+"-"+p.brand+"\n"+p.price+"\nDiscount+\n\n");
        }
        return products;
    }

    private String dateFormat(){
        String fDateTime;
        DateTimeFormatter  dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        fDateTime=this.dateTime.format(dateTimeFormatter);
        return fDateTime;
    }

    @Override
    public String toString(){
        return "Date: "+dateFormat()+"\n\n---Products---\n\n"+allProducts()+"------------------------"+
                "\n\nSUBTOTAL: "+subTotal+"\nDISCOUNT: "+discount+"\n\nTOTAL: "+total;
    }
}
