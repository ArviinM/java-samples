import java.util.Scanner;
public class SampleWhile{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a Number:");
		num = sc.nextInt();
		
		while (num <= 10){
			num++;
			System.out.println(num);
		}
	}
}