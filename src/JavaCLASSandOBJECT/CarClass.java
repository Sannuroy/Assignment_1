package JavaCLASSandOBJECT;

public class CarClass {
	int modely=2020;
	String colora="yellow";
	byte maxSpeed1= 126;
	int modelx=2001;
	String  colorb="blue";
	byte maxSpeed2= 120;
	public static void main(String[] args) {
		
		CarClass bmw = new CarClass();//creating a object
		CarClass glanza = new CarClass();
		System.out.println("the bmw model is:"+ bmw.modely + " " + bmw.colora + " " + bmw.maxSpeed1);
		System.out.println("the glanza model is:"+ glanza.modelx + " " + glanza.colorb + " " + glanza.maxSpeed2);
	}

}
 