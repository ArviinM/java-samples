import java.util.Scanner;
public class ForLoop2 {
	public static void main(String [] args){
		int base, power;
		int result = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		base = sc.nextInt();
		
		System.out.print("Enter the power number: ");
		power = sc.nextInt();
		
		for(int i = 1; i<= power; i++){
			result *= base;
		}
		System.out.println("Result: " + result);
	}
}