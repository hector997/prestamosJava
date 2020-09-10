package com.hectorvillarino;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Scanner scanner = new Scanner(System.in);
        System.out.print("monto de tu prestamo: ");
        int totalLoan = scanner.nextInt();

        System.out.print("interés anual?(%) : ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("período? (años) :");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double monthlyPayments = totalLoan * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) -1);
        String paymentsFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayments);

        double totalPayment = monthlyPayments * numberOfPayments;
        String totalPaymentFormatted = NumberFormat.getCurrencyInstance().format(totalPayment);

        System.out.println("total al pagar : " + totalPaymentFormatted);
        System.out.println("número de cuotas: " + numberOfPayments);
        System.out.println("monto pagos mensuales: " + paymentsFormatted);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}














