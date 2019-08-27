import java.util.Scanner;

public class Wage_Calculator {

	public static void main(String[] args) {
		
		
		System.out.println(salary());
	}
	
	static int salary(){
		
		Scanner sc = new Scanner(System.in);
	    int wage = sc.nextInt();
	    sc.close();
	    wage = wage * 40 * 50;
	      
		return wage;
	}
}
