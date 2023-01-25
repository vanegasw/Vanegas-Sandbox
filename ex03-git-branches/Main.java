import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    // Create an inventory of Items. Once Item is created, this can be uncommented.

    //Testing Creating an Inventory
    System.out.println("________________________________________");
    System.out.println("Creating an inventory:");
    
    ArrayList<Item> inventory = new ArrayList<>();
    inventory.add(new Item("banana",.52,100));
    inventory.add(new Item("milk",3.57,20));
    inventory.add(new Item("chocolate bar",4.50,32));
    
    System.out.println("Inventory: "+inventory.toString());

    // Create a cart and add some items from the inventory.
    Cart cart = new Cart(false);
    cart.add(inventory.get(0), 2);
    cart.add(inventory.get(2), 5);

    cart.printCart();

    // Checkout the cart

    // Print receipt

  }
}


