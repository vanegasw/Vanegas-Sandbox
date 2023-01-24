// An order is the combination of a cart and tax
// different states apply different salesTax rates.
public class Order {

    private Cart cart;
    private Customer customer;
    private int id;


    public Order( Cart c, String n, String e, int id ) {
        cart = c;
        customer.setName(n);
        customer.setEmail(e);
        customer.setId(id);
      }

    public double total() {

        return 0.0;
    }


}





