package JavaMETHODS;

public class PublicMETHOD {
public String name  = "jannet golu princy";
public void printName() {
	System.out.println("my friend name is:"+name);
}
public static void main(String[] args) {
	PublicMETHOD obj = new PublicMETHOD();
	System.out.println(obj.name);
	obj.printName();
}
}
