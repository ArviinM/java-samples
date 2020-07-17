import java.util.Scanner;
class SampleFunction3 {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		double p = 0;
		System.out.print("Enter prelim grade: ");
		p = sc.nextDouble();
		double mt = 0;
		System.out.print("Enter midterms grade: ");
		mt = sc.nextDouble();
		double pf = 0;
		System.out.print("Enter pre-finals grade: ");
		pf = sc.nextDouble();
		double f = 0;
		System.out.print("Enter finals grade: ");
		f = sc.nextDouble();
		double gwa = ave(p,mt,pf,f);
		System.out.print("\r"+gwa);
		double remarks = rem(gwa);
		double equivalent = equi(gwa);
	}
	public static double ave(double p, double mt, double pf, double f){
		double average = 0;
		average = (p*.2) + (mt*.2) + (pf*.2) + (f*.4);
		average = Math.round(average * 100.0) / 100.0;
		return average;
	}
	public static double rem(double gwa){
		//double gwa = 0;
		if(gwa < 75){
			System.out.println("\rFAILED");
		} else {
			System.out.println("\rPASSED");
		}
		return gwa;
	}
	public static double equi(double gwa){
		if(gwa > 91){
			System.out.println("A");
		} else if(gwa > 81){
			System.out.println("B");
		} else if(gwa > 71){
			System.out.println("C");
		} else if(gwa > 61){
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		return gwa;
	}
	
}