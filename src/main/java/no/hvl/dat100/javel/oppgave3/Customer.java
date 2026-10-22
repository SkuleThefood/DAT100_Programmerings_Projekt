package no.hvl.dat100.javel.oppgave3;

import static no.hvl.dat100.javel.oppgave3.PowerAgreementType.*;

public class Customer {
    String name;
    String email;
    int customer_id;
    PowerAgreementType agreement;


    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomer_id(){
        return customer_id;
    }
    public PowerAgreementType getPowerAgreementType(){
        return agreement;
    }
    public void setName(String nName){
        name = nName;
    }
    public void setEmail(String nEmail){
        email = nEmail;
    }
    public void setCustomer_id(int nCustomer_id){
        customer_id = nCustomer_id;
    }
    public void setPoweragreementType(PowerAgreementType nAgreement){
        agreement = nAgreement;
    }
    public String toString(){
        String toReturn = "";

        toReturn = "Customer id: " + customer_id + ", Name: " + name + ", Email: " + email + ", Agreement: " + agreement;

        return toReturn;
    }


}
