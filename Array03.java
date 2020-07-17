import java.util.Arrays;
import java.util.Scanner;
public class Array03{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int i, num;
		System.out.print("Enter length of array: ");
		num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.println("Enter " + num + " elements: ");
		for(i = 0; i<num; i++){
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		
		int sum = 0;
		for(i = 0; i < num; i++){
			sum += arr[i];
		}
		System.out.println("Sum is: " + sum);
	}
}