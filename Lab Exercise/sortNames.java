import java.util.Scanner;
import java.util.Arrays;
class sortNames{
	public static void main(String [] args){
		int i;
		Scanner sc = new Scanner(System.in);
		String[] names= new String[5];
		System.out.print("Enter name: ");
		for(i=0; i<names.length;i++){
			names[i] = sc.nextLine();
		}
		Arrays.sort(names);
		System.out.println("Names are");
		for(String name: names){
			System.out.println(name);
		}
	}
}