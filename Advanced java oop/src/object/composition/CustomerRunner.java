package object.composition;
public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress  = new Address("Line-1","Joypurhat","5900");
        Customer customer = new Customer("Sourav",homeAddress);

//        Address workAddress = new Address("Line-1 for work","Bogura","6000");
//        customer.setWorkAddress(workAddress);

        System.out.println(customer);


//        Customer customer1 = new Customer("Puspom", new Address("line-1","noakhali","6666"));
     System.out.println("----------");
//        System.out.println(customer1);
        Address homeAddress1 = new Address("line-5","rangpur","3333");
        customer.setHomeAddress(homeAddress1);
        System.out.println(homeAddress1);
    }
}
