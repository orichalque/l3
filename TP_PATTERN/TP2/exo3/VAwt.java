import java.awt.*;
import java.awt.*;
public class VAwt extends FrameUsed {
	
	protected Frame f;
	
	public VAwt() {
		Frame f = new Frame("temporary name");
	}
	
	public void show() {
		f.show();
	}
	
	public void setSize(int x, int y) {
		f.setSize(x,y);
	}
	
	public void setFont(String name, int style, int size) {
		Font font = new Font(name, style, size);
		f.setFont(font);
	}
	
	public void setTitle(String s)
	{ System.out.println("");}
	public void init()
	{ System.out.println("");}
}
