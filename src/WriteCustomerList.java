import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class WriteCustomerList {
	public static void main(String[] args) {
		//variables
		File f = new File("src/customer.txt");
		String id;
		String firstName;
		String lastName;
		double balance;
		boolean cont = true;
		OutputStream output = null;
		try {
			output = new BufferedOutputStream(Files.newOutputStream(f.toPath()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(output));
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the customer's Id# or quit to stop: ");
		id = input.next();
		if (id.toLowerCase().equals("quit")) {
			cont = false;
		}
		while (cont == true) {

			System.out.println("Enter the customer's first name: ");
			firstName = input.next();
			System.out.println("Enter the cutomer's last name: ");
			lastName = input.next();
			System.out.println("Enter the customer's balance owed: ");
			balance = input.nextDouble();
			//writes to the file
			try {
				write.write(id + ":" + firstName + ":" + lastName + ":" + balance+"\n");
			}
			catch (Exception e) {
				System.out.println("Oops something went wrong try again.");
			}
			System.out.println("Enter the customer's Id# or quit to stop: ");
			id = input.next();
			if (id.toLowerCase().equals("quit")) {
				cont = false;
			}
		}
		
		try {
			write.close();
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
