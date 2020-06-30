//RuntimeException
public class Fifth {
	public static void main(String[] args) {
		try {
			String num = "10d";
			int i = Integer.parseInt(num);
			System.out.println(i);
		} catch (NumberFormatException e) {
			System.out.println("please enter number only");
		}
	}
}
