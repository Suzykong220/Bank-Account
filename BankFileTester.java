import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class BankFileTester {
	
	public static void main(String[] args) {
		Bank bank = new Bank(7);
		Scanner in = new Scanner(System.in);
		System.out.println("Give us a file name");
		String fileName = in.nextLine();
		BankIO.readFile(fileName, bank);
		
		
		BankIO.write(bank, "newFileTest.txt");
	}
		
}
