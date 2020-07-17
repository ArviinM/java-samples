public class ForLoop3{
	public static void main(String [] args){
		int x, y;
		
		for(x = 1; x<=5;){
			for(y = 1; y<=x;y++){
				System.out.print(x * y + "\t");
			}
			System.out.println();
		}
		
	}
}