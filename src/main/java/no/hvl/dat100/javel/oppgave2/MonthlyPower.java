package no.hvl.dat100.javel.oppgave2;

import no.hvl.dat100.javel.oppgave1.DailyPower;

public class MonthlyPower {

    // a) print power usage for a month
    public static void print_PowerUsage(double[][] usage) {

        for (int x = 0; x<usage.length; x++){
            System.out.print("Dag " + (x+1) + ":  ");
            for (int y = 0; y<usage[x].length; y++){
                System.out.print("Time " + (y+1) + ": " + usage[x][y] + " kWh,   ");
            }
            System.out.println();
        }

    }

    // b) print power prices for a month
    public static void print_PowerPrices(double[][] prices) {

        for (int x = 0; x<prices.length; x++){
            System.out.print("Dag " + (x+1) + ":  ");
            for (int y = 0; y<prices[x].length; y++){
                System.out.print("Time " + (y+1) + ": " + prices[x][y] + " NOK,   ");
            }
            System.out.println();
        }

    }

    // c) compute total power usage for a month
    public static double computePowerUsage(double[][] usage) {

        double sum = 0;

        for (int x = 0; x<usage.length; x++){
            for (int y = 0; y<usage[x].length; y++){
                sum = sum + usage[x][y];
            }
        }

        return sum;
    }

    // d) determine whether a given threshold in powerusage for the month has been exceeded
    public static boolean exceedThreshold(double[][] powerusage, double threshold) {

        boolean exceeded = false;
        double usage = 0;

        for (int x = 0; x<powerusage.length; x++){
            for (int y = 0; y<powerusage[x].length; y++){
                usage = usage + powerusage[x][y];
                if (usage > threshold){
                    return true;
                }
            }
            if (usage > threshold){
                return true;
            }
        }
        return exceeded;
    }

    // e) compute spot price
    public static double computeSpotPrice(double[][] usage, double[][] prices) {

        double price = 0;

        for (int x = 0; x<usage.length; x++){
            for (int y = 0; y<usage[x].length; y++){
                price = price + (usage[x][y]*prices[x][y]);
            }
        }

        return price;
    }

    public static final double THRESHOLD = 0.9375;
    public static final double PERCENTAGE = 0.9;

    // f) power support for the month
    public static double computePowerSupport(double[][] usage, double[][] prices) {

        double support = 0;

        for (int x = 0; x<usage.length; x++){
            for (int y = 0; y<usage[x].length; y++) {
                if (prices[x][y] < THRESHOLD) {
                    support += prices[x][y] * usage[x][y];
                }
                if (prices[x][y] >= THRESHOLD) {
                    support += (THRESHOLD) + ((prices[x][y] * usage[x][y]) - THRESHOLD) * (1 - PERCENTAGE);
                }
            }
        }


        return support;
    }

    // g) Norgesprice for the month
    public static double computeNorgesPrice(double[][] usage) {

        double price = 0;

        for (int x = 0; x < usage.length; x++) {
            for (int y = 0; y < usage[x].length; y++) {
                price = price + (usage[x][y] * 0.5);
            }
        }

        return price;
    }
}
