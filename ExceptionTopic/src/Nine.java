
class D {
	void foo() throws Exception {
		System.out.println("hi");
	}
}

public class Nine extends D {
	//child can remove exception
	void foo() {
		System.out.println("hi child");
	}

	public static void main(String[] args) {
		new Nine().foo();
	}

}
