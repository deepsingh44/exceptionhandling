//RuntimeException
public class Third {
	public static void main(String[] args) {
		try {
			String text = "deep singh";
			System.out.println(text.charAt(50));
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("please check the index");
		}
	}
}
