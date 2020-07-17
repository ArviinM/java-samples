public class SampleNestedFor{
	public static void main (String [] args){
		int x, y;
		int z = 1;
		int j = 5;
		//System.out.println("Multiplication Table of 1-10");
		
		for(x = j; x > 0 ; x--){
			for(y = 1; y <= x; y++){
				System.out.print(" ");
			}
			for(y = 1; y <=z; y++){
				System.out.print(z+" ");
			}
			
			System.out.println();
			z++;
		}
		
		
	}
}