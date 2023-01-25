public class Item {
    private String description;
    private double price;
    private int quantity;

    Item(String newDesc, double newPrice, int newQuantity){
        description = newDesc;
        price = newPrice;
        quantity = newQuantity;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getDescription(){
        return description;
    }

    public int getQuantity(){
        return quantity;
    }

}
