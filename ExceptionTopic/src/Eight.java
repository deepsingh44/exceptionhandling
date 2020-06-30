
public class Eight {
	void a()throws Exception{
		int i=10/0;
		System.out.println("hello");
	}
	
	
	void b() {
		try {
			a();
		} catch (Exception e) {
			System.out.println("hey its me");
		}
	}
public static void main(String[] args) {
	new Eight().b();
}
}
