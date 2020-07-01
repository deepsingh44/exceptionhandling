//propagoted in this case try block is never propagated.
public class Seven {
	void a() {
		try {
			int i = 10 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("please dont div a number by 0");
		}
	}

	void b() {
		// call a from b location
		try {
			a();
		} catch (Exception e) {
			System.out.println("hey its deep");
		}
	}

	public static void main(String[] args) {
		new Seven().b();
	}

}
