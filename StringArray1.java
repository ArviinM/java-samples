import java.util.Arrays;
import java.util.Scanner;
public class StringArray1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in)AA;
		
		String [] names = new String[5];
		System.out.println("Enter 5 Names:");
		for(int i = 0; i<names.length;i++){
			names[i] = sc.nextLine();
		}
		
		Arrays.sort(names);
		System.out.println("Names");
		for(String name: names){
			System.out.println(name);
		}
		
	}
}