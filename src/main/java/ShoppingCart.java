import java.text.NumberFormat;
import java.util.ArrayList;

public class ShoppingCart{
    private ArrayList<Double> total = new ArrayList<>();
    private double totalPrice;
    private final int shippingFees = 10;
    private ArrayList<Item> items = new ArrayList<>();
    private final double saleTaxes = 0.01;
    public void addItem(Item p){
        total.add(p.getPrice() * p.getQuantity());
        items.add(p);
    }
    public void calculateTotal(){
       for(double p:total){
           this.totalPrice += p;
       }
        double tax = this.totalPrice * this.saleTaxes;
        if(this.totalPrice < 10){
           this.totalPrice += 10;
        }
        this.totalPrice += tax;
    }
    public String getTotal(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return fmt.format(this.totalPrice);
    }
    public Invoice shipOrder(String name, String streetAddress, String city, String state, int zipCode){
        return new Invoice(name,streetAddress,city,state,zipCode,this.items,this.totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "total=" + total +
                ", totalPrice=" + totalPrice +
                ", shippingFees=" + shippingFees +
                ", items=" + items +
                ", saleTaxes=" + saleTaxes +
                '}';
    }
}