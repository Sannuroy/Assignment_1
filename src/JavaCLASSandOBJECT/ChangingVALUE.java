package JavaCLASSandOBJECT;

public class ChangingVALUE {
	int x =5;
	public static void main(String[] args) {
		ChangingVALUE num = new ChangingVALUE();//OBJECT1
		ChangingVALUE num2 = new ChangingVALUE();// OBJECT2
		num2.x = 23;
		System.out.println(num.x);
		System.out.println(num2.x);
	}

}
