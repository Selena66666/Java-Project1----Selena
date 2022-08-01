package firstVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		List myList = new ArrayList();
		
		System.out.println("Please enter the number of shipping products: ");
		System.out.println("Laptop: ");
		int a = in.nextInt();
		myList.add(a);
		
		
		System.out.println("Mouse: ");
		int b = in.nextInt();
		myList.add(b);
		
		System.out.println("Desktop: ");
		int c = in.nextInt();
		myList.add(c);
		
		System.out.println("LCD screen: ");
		int d = in.nextInt();
		myList.add(d);
		
		System.out.println(myList);
		
		double volume = (double)a * 0.6 * 0.5 * 0.5 + b * 0.3 * 0.3 * 0.2 + c * 1 * 1.5 * 0.5 + d * 1.2 * 1.4 * 0.8;
		System.out.println("The total volume of the Shipment is " + volume + " m^3.");
		
		double weight = (double)a * 6.5 + b * 0.2 + c * 20 + d * 2.6;
		System.out.println("The total weight of the Shipment is " + weight + " kg.");
		
		double sV = 2.59 * 2.43 * 6.06;
		double bV = 2.59 * 2.43 * 12.01;
		
		if(volume <= sV) {
			System.out.println("1 small container.");
		}else if(volume <= 2 * sV) {
			System.out.println("1 big container.");
		}else {
			
			double n = volume / bV;
			double m = volume % bV;
			
			if(m <= sV) {
				System.out.println((int)Math.floor(n) + " big containers, " + "1 small container.");
			}else {
				System.out.println(((int)Math.floor(n)+1) + " big containers. ");
				
			}
			
			
		}
		
	}

}
