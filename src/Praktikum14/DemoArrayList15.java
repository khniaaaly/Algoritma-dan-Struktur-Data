import java.util.ArrayList;

public class DemoArrayList15 {
    public static void main(String[] args) {
        ArrayList <Customer15> customers = new ArrayList <> ();
        Customer15 customer1 = new Customer15(1, "Zakia");
        Customer15 customer2 = new Customer15(5, "Budi");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(new Customer15(4, "Cica"));
        customers.add(2, new Customer15(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer15 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList <Customer15> newCustomers = new ArrayList <> ();
        newCustomers.add (new Customer15(201, "Della"));
        newCustomers.add (new Customer15(202, "Victor"));
        newCustomers.add (new Customer15(203, "Sarah"));

        customers.addAll (newCustomers);

        for (Customer15 cust : customers) {
            System.out.println(cust.toString());
        }
    }
}
