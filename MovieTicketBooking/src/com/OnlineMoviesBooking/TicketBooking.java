package com.OnlineMoviesBooking;
import java.util.Scanner;

public class TicketBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int availableSeats = 20;
        int pricePerSeat = 200;

        System.out.println("Enter Your Age...");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("This movie is not suitable for children under 18.");
        } else {
            System.out.println("Number Of Booking Seats...");
            int seats = sc.nextInt();

            if (seats <= availableSeats) {
                System.out.println("Seats Are Available");

                double totalPrice = seats * pricePerSeat;
                double discount = 0.0;

                if (age >= 60) {
                    System.out.println("You Will Get 30% Discount");
                    discount = 0.30;
                } else if (age >= 18) {
                    System.out.println("You Will Get 20% Discount");
                    discount = 0.20;
                } 

                double discountAmount = totalPrice * discount;
                double finalAmount = totalPrice - discountAmount;

                System.out.println("Final Amount to Pay: ₹" + finalAmount);

                availableSeats -= seats;
                System.out.println("Booking Confirmed for " + seats + " seats.");
                System.out.println("Remaining Seats: " + availableSeats);
            } else {
                System.out.println("Seats Are Not Available");
            }
        }
    }
}