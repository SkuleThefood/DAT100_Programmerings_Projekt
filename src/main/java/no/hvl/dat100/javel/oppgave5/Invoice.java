package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave2.MonthPowerData.*;
import no.hvl.dat100.javel.oppgave2.MonthlyPower.*;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class Invoice {

    private Customer c; // customer associated with this invoice
    private String month; // month that the invoice covers
    private double[][] usage; // power usage this month (per day and per hour)
    private double[][] power_prices; // power prices for this month

    private double amount; // power price for this month


    public Invoice(Customer c, String month, double[][] usage, double[][] power_prices) {
        this.c = c;
        this.month = month;
        this.usage = usage;
        this.power_prices = power_prices;
        this.amount = amount;

    }

    public void computeAmount(PowerAgreementType agreement) {

        double amount = 0;
        if (agreement == PowerAgreementType.SPOTPRICE){
            amount = MonthlyPower.computeSpotPrice(usage,power_prices);
        }
        if (agreement == PowerAgreementType.NORGESPRICE){
            amount = MonthlyPower.computeNorgesPrice(usage);
        }
        if (agreement == PowerAgreementType.POWERSUPPORT){
            amount = MonthlyPower.computePowerSupport(usage, power_prices);
        }
        this.amount = amount;
    }

    public void printInvoice() {
        System.out.println("============================");
        System.out.println(c.toString());
        System.out.println();
        System.out.println("Month: " + month);
        System.out.println("Usage: " + MonthlyPower.computePowerUsage(usage) + " kWh.");
        computeAmount(c.getPowerAgreementType());
        System.out.println("Amount: " + amount + " NOK.");
        System.out.println("============================");
    }
}
