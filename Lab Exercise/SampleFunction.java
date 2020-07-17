class SampleFunction{
	public static void main(String [] args){
		double a = 6.00;
		double b = 9.00;
		double num;
		num = sumof(a,b); // sumof function - calling method
		System.out.println("The sum of a and b is: " + num);
		
	}
	public static double sumof(double a, double b){
		double sum;
		sum  = a+b;
		return sum;
	}
}