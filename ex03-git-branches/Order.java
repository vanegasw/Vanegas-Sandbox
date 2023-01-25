import java.util.Random;

// An order is the combination of a cart and tax
// different states apply different salesTax rates.
public class Order {

    private Cart cart;
    private Customer customer;
    private int ID;

    private Random rand = new Random();


    public Order(Cart newCart, Customer newCustomer ){
        cart = newCart;
        customer = newCustomer;
        ID = rand.nextInt(1001);
    }

    //The receipt() method should print order number, customer information, cart, and total.
    public void receipt(){
        System.out.println("Order Number: "+ID);
        System.out.println("Customer Information:");
        System.out.println("Name: "+customer.getName()+" | Email: "+customer.getEmail());
        System.out.println("Cart Information:");
        System.out.println();
        System.out.println("Total payemnt due: " + cart.getTotal());
    }


}