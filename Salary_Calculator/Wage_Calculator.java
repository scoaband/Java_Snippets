import java.util.Scanner;

public class Wage_Calculator {

	public static void main(String[] args) {
		
		
		System.out.println(salary());
		
	}
	
	static int salary(){
		int wage;
		
		System.out.println("Hourly Salary: ");
		Scanner sc = new Scanner(System.in);
		wage = sc.nextInt();
	    sc.close();
	    wage = wage * 40 * 4 * 12;
	      
		return wage;
	}
}
