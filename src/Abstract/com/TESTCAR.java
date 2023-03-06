package Abstract.com;

public class TESTCAR {
	public static void main(String[] args) {
		absmod a;
		a = new NenoCAR();
		System.out.println("MODEL OF CAR IS:"+a.modelsofCAR());
		a = new tharCAR();
		System.out.println("MODEL OF CAR IS:"+a.modelsofCAR());
	}

}