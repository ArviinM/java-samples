/* 
 *Scanner dahil static na program
 *or with user input.
 *Reminders:
 *This may or may totally not be
 *included sa activity tomorrow
 *Thank you <3
*/

import java.util.Scanner;
public class Conditions1 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		double no; //no is number
		
		System.out.print("Input your grade: ");
		no = sc.nextDouble();
		
		if (no >= 90){
			System.out.print("A");
		} else if (no >= 80){
			System.out.print("B");
		} else if (no >= 75){
			System.out.print("C");
		} else if (no < 50 || no > 100){
			System.out.print("Input Error");
		} else {
			System.out.print("F");
		}
		
	}
}