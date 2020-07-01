
//what is chaining exception
public class Twelve {
	public static void main(String[] args) {

		//reason justify chaining exception
		try {
			throw new Exception("your salary cut",new Exception("because you were comming late",new Exception("5 days",new Exception("nahi aaunga"))));
		}catch (Exception e) {
			//System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			System.out.println(e.getCause().getMessage());
			System.out.println(e.getCause().getCause().getMessage());
			System.out.println(e.getCause().getCause().getCause().getMessage());
		}
		
		
	}
}
