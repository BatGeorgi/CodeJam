import java.io.InputStream;
import java.io.OutputStream;


public class InteractiveTester {

	public static void main(String[] args) throws Exception {
		Process p = Runtime.getRuntime().exec("py tool.py 0");
		OutputStream os = p.getOutputStream();
		InputStream is = p.getInputStream();
		Solution.test(is, os);
		p.waitFor();
	}

}
