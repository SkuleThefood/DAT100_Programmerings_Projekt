package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave4.Customers;

import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.*;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();

        Customer test = new Customer("Alice", "alice@example.gov", 1, SPOTPRICE);

        System.out.println(test.getCustomer_id());
        System.out.println(test.getName());
        System.out.println(test.getEmail());
        System.out.println(test.getPowerAgreementType());
        System.out.println();

        test.setName("Alica");
        test.setCustomer_id(5);
        test.setEmail("alica@example.gov");
        test.setPoweragreementType(NORGESPRICE);

        System.out.println(test.getCustomer_id());
        System.out.println(test.getName());
        System.out.println(test.getEmail());
        System.out.println(test.getPowerAgreementType());
        System.out.println();

        System.out.println(test.toString());
    }
}
