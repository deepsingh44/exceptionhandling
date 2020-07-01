//throw keyword
//1.throw keyword is used to throw any exception explicit.
//2.internally jvm also used throw keyword to throw an exception.
//3.throw keyword used inside method body or constructor body.
//4.we can also rethrow an exception using throw keyword.
//5.after throw keyword we can never use any statement.
//6.throw keyword is used for custom exception mostly.
public class Ten {
	public static void main(String[] args) throws Exception {
		// throw new ArithmeticException("hey its me");

		try {
			int i = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}
}
