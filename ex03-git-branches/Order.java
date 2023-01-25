// An order is the combination of a cart and tax
// different states apply different salesTax rates.
public class Order {

    private Cart cart;
    private Customer customer;
    private int ID;


    public Order(Cart newCart, Customer newCustomer ){
        cart = newCart;
        customer = newCustomer;
        //TODO: initialize Order ID
      }

    public double total() {
        return 0.0;
    }


}