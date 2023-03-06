package JavaCLASSandOBJECT;

public class FinalValue {
final int x=10;
public static void main(String[] args) {
	FinalValue number = new FinalValue();
	number.x = 30;// will generate error
	System.out.println(number.x);
}
}
