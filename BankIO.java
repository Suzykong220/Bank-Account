import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;


public class BankIO {
	private Bank bank;

	public static void readFile(String filename, Bank bank) {
		
		try{
		File inFile = new File(filename);
			Scanner inScan = new Scanner(inFile);
			while (inScan.hasNextLine())
				readAccount(inScan);
		}catch(FileNotFoundException e){
			System.out.println("Cound not find the file.");
		}
		System.out.println("Finsihed");
	}
	
	public static BankAccount readAccount(Scanner in){
		
		if (in.hasNextLine()){
			int accountNum = in.nextInt();
			double balance = in.nextDouble();
				BankAccount bank = new BankAccount(balance, accountNum);
				System.out.println("The bank has balance " + balance + " and the account number " + accountNum);
				return bank;
			}
		return null;	
	}
	
	public static void write(Bank bank, String filename){
			PrintWriter out;
			File inFile = new File("/Users/air/Desktop/Study Up/Courses 16Sum/untitled folder/BankLab/accounts.txt");
			try {
				Scanner inScan = new Scanner(inFile);
		        out = new PrintWriter(filename);
		        while (inScan.hasNextLine()){
		        	bank.add(readAccount(inScan));
		        }
		        out.println(bank.toString());
		        out.close();
		        inScan.close();
		    }
		    catch (FileNotFoundException e) {
		       System.out.println("File is not Found!");
		    }
			
		}
	
	}