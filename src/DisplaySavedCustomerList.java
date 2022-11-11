import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;

public class DisplaySavedCustomerList {

	public static void main(String[] args) throws IOException {
		File f = new File("src/customer.txt");
		InputStream input = new BufferedInputStream(Files.newInputStream(f.toPath()));
		BufferedReader read = new BufferedReader(new InputStreamReader(input));
		while (read.ready()) {
			System.out.println(read.readLine());
		}

	}

}
