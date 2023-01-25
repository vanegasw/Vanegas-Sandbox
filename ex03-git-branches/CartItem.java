public class CartItem {
  private Item item;
  private double subtotal;
  //Quantity is quantity to purchase (different from quantity in item)
  //Default is set to 1
  private int quantity = 1;

  
  public CartItem(Item newItem) {
    subtotal = newItem.getPrice()*quantity;
    //quantity = 0;
  }
  

  public String cartDescription() {
    String description = item.getDescription();
    return description;
  }

  public double price() {
    subtotal = item.getPrice() * quantity;
    return subtotal;
  }
}
