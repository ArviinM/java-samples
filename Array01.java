import java.util.Scanner;
public class Array01{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int i, num ;
		System.out.print("Enter Length of Array: ");
		num = sc.nextInt();
		
		int [] arr = new int[num];
		System.out.println("Enter " + num + " Elements: ");
		for (i = 0; i <num;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements in Array");
		for(i = 0; i<num; i++){
			System.out.print(arr[i] + "\t");
		}
		int sum = 0;
		for(i = 0; i<num; i++){
			sum += arr[i];
		}
		System.out.println("\r\rSum is: " + sum);
	}
}