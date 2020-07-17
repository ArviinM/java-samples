public class Recursion05{
	public static void main(String [] args){
		System.out.print("" + fibonacci(10));
	}
	public static int fibonacci(int num){
		if(num == 0){
			return 0;
		} else if (num == 1){
			return 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}
}