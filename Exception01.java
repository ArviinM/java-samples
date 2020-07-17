import java.util.*;
public class Exception01{
	public static void main(String [] args){
		Exception01 ex = new Exception01();
		ex.input();
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		int dividend, divisor, quotient;
		System.out.print("Enter dividend: ");
		dividend = sc.nextInt();
		System.out.print("Enter divisor: ");
		divisor = sc.nextInt();
		try{
			quotient = dividend / divisor;
			System.out.print(dividend + " / " + divisor + " = " + quotient);
		}
		catch(ArithmeticException e){
			System.out.println("Divisor cannot be 0");
			System.out.println("Try again.");
		}
		catch(InputMismatchException e){
			System.out.print("Wrong data type!");
			System.out.println("Try again.");
		}
		finally{
			System.out.println("\rThank you!");
		}
	}
}