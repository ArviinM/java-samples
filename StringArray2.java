import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

class StringArray2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int row, i;
		
		System.out.print("Enter a positive number: ");
		row = sc.nextInt();
		
		System.out.print("Enter " + row +" names: ");
		String[] names = new String[row];
		for(i=0; i<names.length; i++){
			names[i] = sc.nextLine();
		}
		Arrays.sort(names);
		for(String name: names){
			System.out.print(name+"\r");
		}
	}
}