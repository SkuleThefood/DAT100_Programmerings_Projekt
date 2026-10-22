package no.hvl.dat100.javel.oppgave1;

import static no.hvl.dat100.javel.oppgave1.DailyPower.*;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        printPowerPrices(powerprices_day);
        printPowerUsage(powerusage_day);
        System.out.println("Total stroem bruk: " + computePowerUsage(powerusage_day) + " kWh.");
        System.out.println("Total stroem pris for dagen: " + computeSpotPrice(powerusage_day, powerprices_day) + " NOK.");
        System.out.println("Stroem pris for ein valt time med stoette: " + getSupport(powerusage_day[7], powerprices_day[9]) + " NOK.");
        System.out.println("Stroem pris for dagen med stoette: " + computePowerSupport(powerusage_day, powerprices_day) + " NOK.");
        System.out.println("Stroem pris for dagen med norgespris: " + computeNorgesPrice(powerusage_day) + " NOK.");
        System.out.println("Mest stroem brukt innan ein time innan dagen er: " + findPeakUsage(powerusage_day) + " kWh.");
        System.out.println("Gjennomsnittleg stroem brukt per time innan dagen: " + findAvgPower(powerusage_day) + " kWh.");
    }
}
