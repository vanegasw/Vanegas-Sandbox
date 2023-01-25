import java.util.Random;

public class Customer {
    private String name;
    private String email;
    private int id;

    private Random rand = new Random();

    Customer(String newName, String newEmail){
        name = newName;
        email = newEmail;
        id = rand.nextInt(101);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void printCustomer(){
        System.out.println("Name: "+name+", Email: "+email);
    }
    
}
