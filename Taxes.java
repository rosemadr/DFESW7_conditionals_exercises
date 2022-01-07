package conditionals;

public class Taxes {
	
	
	public static int taxPercent(int salary) {
		
		int tax = 0;
		
		if (salary >= 15000) {
			
			tax = 10;	
			
		} if (tax >= 20000) {
			
			tax = 15;
			
		} if (salary >= 30000) {
			
			tax = 20;
			
		} if (salary >= 45000) {
			
			tax = 25;
		}
		
		return tax;
	}

	public static void printTax(int salary) {
		
		int tax = taxPercent(salary);
		
		System.out.println("Your tax is " + tax + "%");
		
	}
	
	public static void main(String[] args) {
		
		printTax(41000);
	}	

}
