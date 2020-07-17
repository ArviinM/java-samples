/*
 Sample program that displays
 String, Int, Double
 */

//import scanner package

import java.util.Scanner;

public class Scanner1 {
	public static void main(String [] args){
		//declare a variable for Scanner
		Scanner sc = new Scanner(System.in);
		
		//String input. Sample is first name
		String name;
		System.out.print("Enter your First Name: ");
		name = sc.next();
		
		//Integer input. Sample is age
		int age;
		System.out.print("Enter you Age: ");
		age = sc.nextInt(); //sc.nextInt() for Integer input
		
		//Double input. Sample is your grade
		double grade;
		System.out.print("Enter your Grade: ");
		grade = sc.nextDouble(); //sc.nextDouble() for decimal input
		
		//Space 
		System.out.println("");
		//String output or name
		System.out.println("Name: " + name);
		//Integer output or age
		System.out.println("Age: " + age);
		//Double output or grade
		System.out.println("Grade: " + grade);
	}
}