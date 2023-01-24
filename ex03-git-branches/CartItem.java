public class CartItem {
  
  
  Item item;
  double Subtotal;
  int Quantity;


  /*public CartItem() {
    Subtotal = 0.0;
    Quantity = 0;
  }*/

  public String cartDescription(){
    String description = item.getDescription();
        return description;
  }

  public double price(){
    item.getPrice();
   Subtotal = item.getPrice() * Quantity;
    return Subtotal;
  }


  
}





