import java.util.Scanner;
public class Measurements{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double num;
		double cm = 0;
		String measurement = "";
		String converter = "";
		
		System.out.println("Available measurements are: millimeter (mm), centimeter (cm)");
		System.out.print("Enter a measurement: ");
		measurement = measurement.toLowerCase();
		measurement = sc.nextLine();
		
		System.out.print("Enter a number: ");
		num = sc.nextDouble();
		
		if(measurement.equals("mm")|| measurement.equals("millimeter")){
			
			System.out.println("Available conversion to: centimeter (cm)");
			System.out.print("Convert number to: ");
			converter = converter.toLowerCase();
			converter = sc.nextLine();
			
			if(converter.equals("cm")||converter.equals("centimeter")){
				cm = num / cm;
				System.out.println("Length in centimeter is: " + cm);
			} else{
				System.out.println("Error, converter not found.");
			}
		} else if(measurement.equals("cm")|| measurement.equals("centimeter")){
			System.out.println("test");
		} else {
			System.out.print("Error");
		}
	}
}