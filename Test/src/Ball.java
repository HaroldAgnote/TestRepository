import java.awt.*;
public class Ball {
	private Point p;
	private int dx, dy, size;
	private Color color;
	public Ball(int x, int y, int s, int radius, Color c) {
		p = new Point(x, y);
		dx = dy = s;
		size = radius;
		color = c;
	}
	public void draw( Graphics g ) {
		g.setColor(color);
		g.fillOval((int)p.getX(), (int)p.getY(), size, size);
	}
	public void move( int width, int height ) {
		if( dx > 0 && (p.getX() > (width - size) )) {
			dx = -dx;
		} else if( dx < 0 && p.getX() < 0 ) {
			dx = -dx;
		}
		if( dy > 0 && p.getY() > height - size ) {
			dy = -dy;
		} else if( dy < 0 && p.getY() < 0 ) {
			dy = -dy;
		}
		p.translate(dx, dy);
	}
}