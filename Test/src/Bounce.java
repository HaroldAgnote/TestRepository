import java.awt.*;
import javax.swing.*;
public class Bounce extends JPanel implements Runnable
{
	private Ball b1, b2, b3, b4, b5, b6, b7;
	
	public Bounce()
	{
		setBackground(Color.BLUE);
		b1 = new Ball(50, 50, 10, 50, Color.GRAY);
		b2 = new Ball(100, 100, 50, 15, Color.RED);
		b3 = new Ball(10, 10, 500, 5, Color.BLACK);
		b4 = new Ball(150, 150, 75, 150, Color.ORANGE);
		b5 = new Ball(250, 250, 100, 250, Color.YELLOW);
		b6 = new Ball(375, 375, 50, 375, Color.WHITE);
		b7 = new Ball(500, 500, 1, 500, Color.PINK);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		b1.move(getWidth(), getHeight());
		b2.move(getWidth(), getHeight());
		b3.move(getWidth(), getHeight());
		b4.move(getWidth(), getHeight());
		b5.move(getWidth(), getHeight());
		b6.move(getWidth(), getHeight());
		b7.move(getWidth(), getHeight());
		b1.draw(g);
		b2.draw(g);
		b3.draw(g);
		b4.draw(g);
		b5.draw(g);
		b6.draw(g);
		b7.draw(g);
	}
	
	public void run()
	{
		while (true)
		{
			repaint();
			try
			{
				Thread.sleep(16); //~60 fps
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}