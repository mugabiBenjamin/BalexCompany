/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.balex_company;

/**
 *
 * @author Benjn
 */
public class Balex_Company {

    // Method to calculate the total pay for an employee
    public static void calculatePay(double basePay, int hoursWorked) {
        final double MIN_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int STANDARD_HOURS = 40;

        // Check if base pay is less than minimum wage
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay must be at least $" + MIN_WAGE + " per hour.");
            return;
        }

        // Check if hours worked is greater than the maximum allowed hours
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Number of hours worked cannot exceed " + MAX_HOURS + " hours.");
            return;
        }

        double totalPay = 0;

        // Calculate pay
        if (hoursWorked <= STANDARD_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - STANDARD_HOURS;
            totalPay = (STANDARD_HOURS * basePay) + (overtimeHours * basePay * 1.5);
        }

        System.out.println("Total pay for " + hoursWorked + " hours at $" + basePay + " per hour is $" + totalPay);
    }

    // Main method to call the calculatePay method for each employee
    public static void main(String[] args) {
        // Employee data
        double[] basePays = {7.50, 8.20, 10.00};
        int[] hoursWorked = {35, 47, 73};

        // Process each employee's pay
        for (int i = 0; i < basePays.length; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            calculatePay(basePays[i], hoursWorked[i]);
            System.out.println();
        }
    }
}
