package no.hvl.dat100.javel.oppgave1;

public class DailyPower {

    // a) print power prices during a day
    public static void printPowerPrices(double[] prices) {
        System.out.println();
        for (int i = 0; i < prices.length; i++){
            System.out.printf("%.2f NOK, ", prices[i]);
        }
        System.out.println();
    }

    // b) print power usage during a day
    public static void printPowerUsage(double[] usage) {
        for (int i = 0; i < usage.length; i++){
            System.out.printf("%.2f kWh, ", usage[i]);
        }
        System.out.println();
    }

    // c) compute power usage for a single day
    public static double computePowerUsage(double[] usage) {

        double sum = 0;

        for (int i = 0; i<usage.length; i++){
            sum = sum + usage[i];
        }
        return sum;
    }

    // d) compute spot price for a single day
    public static double computeSpotPrice(double[] usage, double[] prices) {

        double price = 0;

        for (int x = 0; x<prices.length; x++){
            price = price + (usage[x] * prices[x]);
        }

        return price;
    }

    // e) compute power support for a given usage and price
    private static final double THRESHOLD = 0.9375;
    private static final double PERCENTAGE = 0.9;

    public static double getSupport(double usage, double price) {

        double support = 0;

        if (price < THRESHOLD){
            support = price * usage;
        }
        if (price >= THRESHOLD){
            support = (THRESHOLD) + ((price*usage)-THRESHOLD)*(1-PERCENTAGE);
        }

        return support;
    }

    // f) compute power support for a single day
    public static double computePowerSupport(double[] usage, double[] prices) {

        double support = 0;

        for (int x = 0; x<usage.length; x++){
            if (prices[x] < THRESHOLD){
                support += prices[x] * usage[x];
            }
            if (prices[x] >= THRESHOLD){
                support += (THRESHOLD) + ((prices[x]*usage[x])-THRESHOLD)*(1-PERCENTAGE);
            }
        }

        return support;
    }

    private static final double NORGESPRIS_KWH = 0.5;

    // g) compute norges pris for a single day
    public static double computeNorgesPrice(double[] usage) {

        double price = 0;

        for (int i = 0; i<usage.length; i++){
            price = price + (usage[i] * NORGESPRIS_KWH);
        }

        return price;
    }

    // g) compute peak usage during a single day
    public static double findPeakUsage(double[] usage) {

        double temp_max = 0;

        for (double i : usage){
            if (temp_max < i){
                temp_max = i;
            }
        }

        return temp_max;
    }

    public static double findAvgPower(double[] usage) {

        double average = 0;

        for (double i : usage){
            average = average + i;
        }
        average = average/usage.length;
        return average;
    }
}