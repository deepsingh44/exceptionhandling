//RuntimeException
public class Fourth {
	public static void main(String[] args) {
		try {
			int[] rolls = {};
			System.out.println(rolls[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please check the index");
		}

	}
}
