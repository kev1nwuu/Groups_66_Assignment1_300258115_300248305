public class Address {

    String street;
    int number;
    String postal;
    
    public Address() {
        this.street = null;
        this.number = 0;
        this.postal = null;
    }
    
    public Address(String streetname, int number, String pos) {
        this.street = streetname;
        this.number = number;
        this.postal = pos;
    }
    
    //getter
    public String getStreet() {
        return street;
    }
        
    public int getNumber() {
        return number;
    }
    public String getPostal() {
        return postal;
    }
    
    
    // setter
    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }
    
    
    public String toString() {
    return " Address: street=" + street + " /number=" + number + " /postal=" + postal;
    }
    
}
    