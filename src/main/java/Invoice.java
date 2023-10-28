import java.text.NumberFormat;
import java.util.ArrayList;

public class Invoice {
    private String Name;
    private String StreetAddress;
    private String City;
    private String State;
    private int zipCode;
    private double totalPrice;
    ArrayList<Item> items;
    public Invoice(String name, String streetAddress, String city, String state, int zipCode,ArrayList<Item> items,double totalPrice) {
        Name = name;
        StreetAddress = streetAddress;
        City = city;
        State = state;
        this.zipCode = zipCode;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String shpt = "";
        shpt = totalPrice < 10 ? String.valueOf(10): "Free";
        for(Item p:items){

            s.append(p.getItemName());
            s.append(" ");
            s.append(fmt.format(p.getPrice()));
            s.append(" ");
            s.append("(");
            s.append(p.getQuantity());
            s.append(")");
            s.append(" ");
            s.append(fmt.format(p.getPrice() * p.getQuantity()));
            s.append("\n");

        }


        return "Ship to :" + "\n" +
                " " + Name + "\n" +
                " " + StreetAddress + "\n" +
                " " + City + ", " + " " + State + " "  + zipCode + "\n"
                + "Items"+ "\n" + "-----" + "\n" + "\n"+ s.toString()+ " Shipping" + " " + shpt
                + "\n"+ "----------" + "\n" + fmt.format(totalPrice);
    }
}
