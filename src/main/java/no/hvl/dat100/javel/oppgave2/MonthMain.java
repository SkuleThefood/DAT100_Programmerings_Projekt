package no.hvl.dat100.javel.oppgave2;

import static no.hvl.dat100.javel.oppgave2.MonthlyPower.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MonthMain {
    public static void main(String[] args) {

        // test data
        double[][] power_prices_month = MonthPowerData.powerprices_month;

        double[][] power_usage_month = MonthPowerData.powerusage_month;

        System.out.println("==============");
        System.out.println("OPPGAVE 2");
        System.out.println("==============");
        System.out.println();

        //print_PowerUsage(power_usage_month); //a
        //print_PowerPrices(power_prices_month); //b
        System.out.println("Total maantleg straum bruk: " + computePowerUsage(power_usage_month) + " kWh."); //c
        System.out.println("Skjekk om maatleg bruk drar over norgespris sin grense: " + exceedThreshold(power_usage_month,5000)); //d
        System.out.println("Straum kostnad for maanen: " + computeSpotPrice(power_usage_month,power_prices_month) + " NOK."); //e
        System.out.println("Kostnad for maaneden med straumstoette: " + computePowerSupport(power_usage_month,power_prices_month) + " NOK."); //f
        System.out.println("Kostnad for maaneden med norgespris: " + computeNorgesPrice(power_usage_month) + " NOK.");
        /*
        TODO

         Write code that tests the methods you implement in the MonthlyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

    }
}