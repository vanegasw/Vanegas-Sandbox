public class CartItem {
  private Item item;
  private double subtotal;
  //Quantity is quantity to purchase (different from quantity in item)
  //Default is set to 1
  private int quantity = 1;

  
  public CartItem(Item newItem) {
    item = newItem;
    subtotal = newItem.getPrice();
  }

  public CartItem(Item newItem, int newQuantity) {
    item = newItem;
    subtotal = newItem.getPrice()*newQuantity;
    quantity = newQuantity;
  }

  public String cartDescription() {
    String description = item.getDescription();
    return description;
  }

  public double price() {
    subtotal = item.getPrice() * quantity;
    return subtotal;
  }

  public int getQuantity(){
    return quantity;
  }

  public double getItemPrice(){
    return item.getPrice();
  }

  public String toString(){
    return ("Item: "+item.toString()+" | Quantity: " + quantity + " | Subtotal: " + subtotal);
  }
}
