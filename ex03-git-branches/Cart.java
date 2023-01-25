import java.util.ArrayList;

// A collection of elements in a cart
// CartContents "has a" CartEntry - using composition
public class Cart {
    private ArrayList<CartItem> cartItems = new ArrayList<CartItem>();
    private double total;
    private boolean paid; 

    public void add(Item newItem, int quantity){
        CartItem newCartItem = new CartItem(newItem,quantity);
        cartItems.add(newCartItem);
    }

    Cart(boolean isPaid){
        paid = true;
    }
    Cart(ArrayList<CartItem> newCartItems, boolean isPaid){
        cartItems = newCartItems;
        paid = isPaid;
    }

    public Order checkout(Customer newCustomer){
        Cart newcart = new Cart(cartItems,true);
        Order newOrder = new Order(newcart, newCustomer);

        return newOrder;
    }

    /* Calculates the total price */
    public void calcTotal(){
        double newTotal = 0.0;
        for(CartItem cartItem:cartItems){
            newTotal =+ cartItem.price();//*cartItem.getQuantity();
        }
        total = newTotal;
    }

    public void printCart(){
        for(CartItem cartItem:cartItems){
            System.out.println(cartItem.cartDescription()+" | Price*Quantity -> | "+cartItem.getItemPrice()+" * "+cartItem.getQuantity()+" = "+cartItem.price());
        }
    }
    //Setters and getters
    public double getTotal(){
        calcTotal();
        return total;
    }
}