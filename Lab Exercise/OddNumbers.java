public class OddNumbers{
	public static void main(String [] args){
		int ctr = 1;
		int num = 0;
		
		for(ctr = 1; ctr<10;){
				//System.out.println(num);
			num = ctr + num;
			System.out.println(ctr);
			ctr = ctr + 2;
			System.out.println(num);
			
		}
		System.out.println(num);
		
	}
}