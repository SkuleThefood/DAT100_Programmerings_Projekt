package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customer test1 = new Customer("Alice", "alice@example.gov", 1, PowerAgreementType.SPOTPRICE);
        Customer test4 = new Customer("Alica", "alica@example.gov", 2, PowerAgreementType.NORGESPRICE);

        Customers test = new Customers(5);
        test.addCustomer(test1);
        test.addCustomer(test4);
        System.out.println(test.countNonNull());
        System.out.println(test.getCustomer(1));
        test.removeCustomer(3);
        System.out.println(test.countNonNull());
        System.out.println();

        Customer[] test2 = test.getCustomers();

        System.out.println(test2.length);
        for (int i = 0; i<test2.length; i++){
            System.out.println(test2[i].toString());
        }
    }
}
