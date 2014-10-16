public class Viewer {

	protected FrameUsed myFrame;
	
	public Viewer(FrameUsed u) {
		myFrame = u;
	}
	
	public void setSize(int x, int y) { 
		myFrame.setSize(x, y);
	}
	
	public void setTitle(String s) { }
	
	public void show() {
		myFrame.show();
	}
	
	public void setFont(String name, int style, int size) { }
	
	public void init() { }
		
}
