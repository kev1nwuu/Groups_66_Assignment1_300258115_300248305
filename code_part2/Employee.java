import java.util.Arrays;

public class Employee {

    private String Name;
    private int Hours;
    private double Rate;
    Address[] addresses;

    
    ////// Constructors
    public Employee(String Name,int Hours, double Rate, Address[] addresses ) {

        this.Name = Name;
        this.Hours = Hours;
        this.Rate = Rate;
        this.addresses = addresses;
    }
    
    // getter
    public String getName() {
        return Name;
    }
    public int getHours() {
        return Hours;
    }
    public double getRate() {
        return Rate;
    }

    public Address[] getaddresses() {
        return addresses;
    }
    
    // setter
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }

    public void setRate(double Rate) {
        this.Rate = Rate;
    }

    public void setaddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public String toString() {
    return "Employee : name=" + Name + ", hours=" + Hours + ", rate=" + Rate + ",\naddress =" + Arrays.toString(addresses) + "]";
    }
}