import java.util.Scanner;
public class ForLoop1 {
	public static void main (String [] args){
		
	    Scanner sc = new Scanner(System.in);
	   	int num;
	   	
	   	System.out.print("Enter a positive number: ");
	   	num = sc.nextInt();
	   	
	   	for (int i = 1; i<=10; i++){
	   		System.out.println(num + " x " + i + " = " + (num*i) );
	   	}
	}
}