package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        Customer test1 = new Customer("Alice", "alice@example.gov", 1, PowerAgreementType.SPOTPRICE);
        Customer test2 = new Customer("Alica", "alica@example.gov", 2, PowerAgreementType.POWERSUPPORT);
        Customer test3 = new Customer("Abraham", "abra@kadabra.gov", 3, PowerAgreementType.NORGESPRICE);

        Invoice best1 = new Invoice(test1, "Jan", CustomerPowerUsageData.usage_month_customer1, MonthPowerData.powerprices_month);
        Invoice best2 = new Invoice(test2, "Jan", CustomerPowerUsageData.usage_month_customer2, MonthPowerData.powerprices_month);
        Invoice best3 = new Invoice(test3, "Jan", CustomerPowerUsageData.usage_month_customer3, MonthPowerData.powerprices_month);

        Invoice[] yest = new Invoice[3];
        yest[0] = best1;
        yest[1] = best2;
        yest[2] = best3;

        Invoices.processInvoices(yest);

        /*
        best1.printInvoice();
        best2.printInvoice();
        best3.printInvoice();
         */
    }
}
