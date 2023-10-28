import java.util.ArrayList;

public class Item {
    private double price;
    private int quantity;
    private String itemName;

    public Item(){};
    public Item(double price, int quantity, String itemName) {
        this.price = price;
        this.quantity = quantity;
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
