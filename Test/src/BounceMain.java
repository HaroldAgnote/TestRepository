import javax.swing.JFrame;
public class BounceMain extends JFrame {
	public BounceMain(){
		Bounce bounce = new Bounce();
		Thread t = new Thread(bounce);
		add(bounce);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1600,900);
		t.start();
		setVisible(true);
	}
	public static void main(String [] args){
		new BounceMain();
	}
}