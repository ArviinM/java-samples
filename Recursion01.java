import java.util.Scanner;

class Recursion01{
	public static void main(String args[]){
		int a, b, sum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		a = sc.nextInt();
		System.out.print("Enter a positive number: ");
		b = sc.nextInt();
		
		sum = add(a,b);
		System.out.print("The sum is: " + sum);		
	}
	public static int add(int a, int b){
		int sum1 = a + b;
		return sum1;
	}
}