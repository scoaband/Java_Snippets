import java.util.Scanner;

public class ShippingCalculator {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int shipWeightPounds;
      int shipCostCents = 15;
      final int FLAT_FEE_CENTS = 75;
      final int CENTS_PER_POUND = 25;
	  System.out.println("Item Weight in Pounds: ");
      shipWeightPounds = scnr.nextInt();
      shipCostCents = FLAT_FEE_CENTS + (CENTS_PER_POUND * shipWeightPounds);
      System.out.println("Weight(lb): " + shipWeightPounds);
      System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
      System.out.println("Cents per pound: " + CENTS_PER_POUND);
      System.out.println("Shipping cost(cents): " + shipCostCents);
   }
}