import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		salary();
		// test();
		
		
		
	}
	
	static void salary(){
		double wage;
		long Fl_Under10tax;
		long Fl_great10tax;
		double yearWage;
		
		System.out.print("Hourly Salary: ");
		Scanner sc = new Scanner(System.in);
		wage = sc.nextInt();
	    sc.close();
	    
	    wage = wage * 40 * 4 * 12;
	    System.out.println("Pre-Taxes Year Salary: " + wage);
	    
	    if(wage <= 10000) {
	    	
		    Fl_Under10tax = (long) (0.1 * wage);
		    yearWage = wage - Fl_Under10tax;
		    System.out.println("Year Salary: " + yearWage);
	    }
	    else {
	    	Fl_great10tax = (long) (0.20 * wage);
	    	yearWage = wage - Fl_great10tax;
		    System.out.println("Year Salary: " + yearWage);
	    }  
	}
	
	static void test() {
		
		
	}
	
	// Class to learn from
	class Bicycle {

	    int cadence = 0;
	    int speed = 0;
	    int gear = 1;

	    // newValue
	    void changeGear(int newValue) {
	         gear = newValue;
	    }
	    // increment
	    void speedUp(int increment) {
	         speed = speed + increment;   
	    }
	    // decrement
	    void applyBrakes(int decrement) {
	         speed = speed - decrement;
	    }

	  
	}
	
}
