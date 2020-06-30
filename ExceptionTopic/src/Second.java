//RuntimeException
public class Second {
	int i=10;
public static void main(String[] args) {
	try {
		Second s=null;
		System.out.println(s.i);
	}catch (NullPointerException e) {
		System.out.println("please initialize object");
	}
}
}
