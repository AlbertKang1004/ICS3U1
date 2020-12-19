package ca.elearningontario.tvdsb.day05;
import hsa_ufa.Console;
import java.awt.*;

// Modify your computer parts program 
// to prompt the user for the part names, prices, etc.
// What happens if you do a readInt() or similar, but the user doesn't enter a number? 
// What if the number is outside the range of the data type?

public class Practice1_4_to_5 {
	
	public static void main(String[] args) throws InterruptedException{
		
		Console c1 = new Console(600, 600, 30);
		c1.print("Part Name : ");
		String partName = c1.readLine();
		
		c1.print("Price : ");
		int price = c1.readInt();
		// if user does not enter an integer, the program waits.
		
		c1.print("Serial Code : ");
		int serialCode = c1.readInt();
		// If user exceeds the limit of integer, an alert appears.
		// Fatal Error: "Unable to convert "999999999999999" to a int
		
		Thread.sleep(2000);
		c1.println("Data Sent!");
		
		Console c2 = new Console(600, 600, 30);
		c2.setColor(new Color(211, 55, 33));
		c2.println("Part_Name : " + partName);
		c2.println("Price : " + price);
		c2.println("Serial_Code : " + serialCode);
	}

}
