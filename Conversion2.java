public class Conversion2 {
	public static void main (String[]main) {
		String str = "1050";
		
		int inum = Integer.parseInt(str);
		System.out.println(inum);
		
		int onum = Integer.valueOf(str);
		System.out.println(onum);
	}
}