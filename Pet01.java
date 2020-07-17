class Pet01{
	private String petName;
	private int petAge;
	private double petWeight;
	public Pet01(String initialName, int initialAge, double initialWeight){
		petName = initialName;
		petAge = initialAge;
		petWeight = initialWeight;
	}
	public static void main(String [] args){
		Pet01 test = new Pet01("Oreo", 5, 20);
		
	}
	
}