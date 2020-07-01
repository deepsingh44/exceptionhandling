//CheckedException
public abstract class Six {
	public static void main(String[] args) throws InstantiationException {
		// static class loading
		//new six();

		// dynamic class loading
		try {
			Class.forName("six").newInstance();
		} catch (ClassNotFoundException e) {
			System.out.println("this class is not exist");
		}catch (NoClassDefFoundError e) {
			System.out.println("please check the class name");
		}catch (IllegalAccessException e) {
			System.out.println("hello");
		}
	}
}
