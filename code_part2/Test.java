public class Test{
    
    public static void main(String[] args) {
        
    
        Address address1 = new Address("Queen", 48, "K1P1N2");
        Address address2 = new Address("King Edward", 800, "K1N6N5");
        
        Address [] addresses = new Address[5];
        
        addresses[0] = address1;
        addresses[1] = address2;
    
        Employee employee = new Employee("Faleao", 40, 15.50, addresses);
    
        System.out.println(employee);

    }
}