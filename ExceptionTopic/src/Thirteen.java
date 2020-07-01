import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

//how to create a log file
public class Thirteen {
	public static void main(String[] args) throws FileNotFoundException {

		try {
			int i=10/0;
		}catch (Exception e) {
			System.out.println("dont div a number by 0");
			FileOutputStream fo=new FileOutputStream("E:\\log\\log.txt",true);
			PrintStream pm=new PrintStream(fo);
			pm.print(new Date(System.currentTimeMillis()));
			e.printStackTrace(pm);
		}
		
	}
}
