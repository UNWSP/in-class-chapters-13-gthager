import java.io.File;

public class fileCompare {

	public static void main(String[] args) {
		File notepad = new File("C:/Users/gthag/OneDrive/Documents/notepadfile.txt");
		File word = new File("C:/Users/gthag/OneDrive/Documents/wordfile.docx");
		System.out.println("Notpad file size: "+notepad.length() + " bytes");
		System.out.println("Word file size: "+ word.length()+ " bytes");
		System.out.println("Ratio: "+word.length()/notepad.length());
	}

}
