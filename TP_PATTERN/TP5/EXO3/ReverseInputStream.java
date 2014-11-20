import java.io.*;

public class ReverseInputStream extends InputStream {
	
	protected InputStream in;
	
	public ReverseInputStream(InputStream i) {
		in = i;
	}
	
	
}
