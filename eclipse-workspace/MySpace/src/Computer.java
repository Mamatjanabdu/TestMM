

	public class Computer {
	// unknown it's a default value for type instance variable (property)
	// later we can change default values, if they are not final
	//all these variables are instance variables
	public String type = "unknown";
	int ram;
	double screenSize;
	String color;
	String OS;
	boolean isPersonal;

	public void printInfo() {
		//local variable that exists inside a method
		String info = "";
		System.out.println("Type: " + type + ", OS: " + OS + ","
				+ " Color: " + color + ", Ram: " + ram + "GB, Personal? "
				+ isPersonal);
	}
}

//provide instance variables/fields for the computer class: 
//type, ram, screenSize, color, OS, isPersonal
//it's highly not recommended to have main method inside this class