package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;

public class Customers {

    private Customer[] customers;

    // a) Complete constructor
    public Customers(int size) {
        customers = new Customer[size];
    }

    // b) count number of non-null references
    public int countNonNull() {
        int count = 0;

        for (int i = 0; i<customers.length; i++){
            if (customers[i] != null){
                count++;
            }
        }
        return count;
    }

    // c) return reference to customer with given id (if exists)
    public Customer getCustomer(int customer_id) {

        Customer c = null;

        for (int i = 0; i<customers.length; i++){
            if (customers[i] != null) {
                if (customers[i].getCustomer_id() == customer_id) {
                    c = customers[i];
                    break;
                }
            }
        }

        return c;
    }

    // d) add a customer to the reference table
    public boolean addCustomer(Customer c) {

        boolean inserted = false;

        for (int i = 0; i<customers.length; i++){
            if (customers[i] == null){
                customers[i] = c;
                inserted = true;
                break;
            }
        }

        return inserted;
    }

    // e) remove customer with given id from reference table
    public Customer removeCustomer(int customer_id) {

        Customer c = null;

        for (int i = 0; i<customers.length; i++){
            if (customers[i] != null) {
                if (customers[i].getCustomer_id() == customer_id) {
                    c = customers[i];
                    customers[i] = null;
                    break;
                }
            }
        }

        return c;
    }

    // f) return reference table with all customers
    public Customer[] getCustomers() {

        int length = countNonNull();
        Customer[] customers = new Customer[length];

        for (int i = 0; i<length; i++){
            customers[i] = getCustomer(i+1);
        }

        return customers;
    }
}