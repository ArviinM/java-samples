public class DoWhile{
	public static void main(String [] args){
		int num = 0;
		
		while (num < 10){
			System.out.println(num);
			++num;
		}
		
		do {
			System.out.println(num);
			--num;
		} while (num >= 0);		
		
	}
}