//custom exception
//yes we can create custom exception either checked or unchecked.
class VotingException extends Exception {
	public VotingException(String msg) {
		super(msg);
	}
}

public class Eleven {
	public static void main(String[] args) throws VotingException {
		int age = 17;
		if (age >= 18) {
			System.out.println("u r valid for vote");
		} else {
			throw new VotingException("u r not a valid for vote.");
		}
	}
}
