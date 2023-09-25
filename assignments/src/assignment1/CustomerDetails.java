package assignment1;
import java.util.Scanner;
public class CustomerDetails {
	 public CustomerDetails(String customerName, long phoneNumber, String address) 
	 {
	 }
	public static void main(String[] args) 
	{
	        Scanner scanner = new Scanner(System.in);

	        // Get customer details
	        System.out.print("Enter customer name: ");
	        String customerName = scanner.nextLine();
	        System.out.print("Enter phone number: ");
	        long phoneNumber = scanner.nextLong();
	        scanner.nextLine(); // Consume newline
	        System.out.print("Enter address: ");
	        String address = scanner.nextLine();

	        new CustomerDetails(customerName, phoneNumber, address);

	        // Get bero type
	        System.out.print("Enter bero type (Steel Bero / Wooden Bero): ");
	        String beroType = scanner.nextLine();

	        // Check and create the corresponding Bero object bero;
	        if ("Steel Bero".equals(beroType)) {
	            System.out.print("Enter bero color: ");
	            scanner.nextLine();
	            System.out.print("Enter bero height (3 / 5 / 7 feet): ");
	            scanner.nextInt();
	            beroType = new String();
	        } else if("Wooden Bero".equals(beroType)) {
	            System.out.print("Enter bero color: ");
	            scanner.nextLine();
	            System.out.print("Enter wood type (Ply Wood / Teak Wood / Engineered Wood): ");
	            scanner.nextLine();

}
	 }
}
	 
