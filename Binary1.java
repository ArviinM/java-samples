import java.util.Scanner;
public class Binary1{
	public static void main(String args []){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		System.out.println("Binary number: " + Integer.toBinaryString(n));
			
	}
}