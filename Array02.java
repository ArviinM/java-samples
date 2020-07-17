import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Array02{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int i, num;
		System.out.print("Enter length of array: ");
		num = sc.nextInt();
		
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		System.out.println("Enter " + num + " elements: ");
		for (i = 0; i < num; i++){
			arr1[i] = sc.nextInt();
		}
		
		Arrays.sort(arr1);
		System.out.println("\rElements of array2 are: " + Arrays.toString(arr1));
		
		Collections.reverse (Arrays.asList(arr1));
		System.out.println("\rElements of array2 are: " + Arrays.toString(arr1));

	}
}