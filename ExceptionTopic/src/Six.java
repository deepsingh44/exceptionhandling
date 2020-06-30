//CheckedException
public abstract class Six {
	public static void main(String[] args) throws InstantiationException {
		// static class loading
		//new Six();

		// dynamic class loading
		try {
			Class.forName("Six").newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("this class is not exist");
		}catch (NoClassDefFoundError e) {
			System.out.println("please check the class name");
		}catch (IllegalAccessException e) {
			System.out.println("hello");
		}
	}
}
