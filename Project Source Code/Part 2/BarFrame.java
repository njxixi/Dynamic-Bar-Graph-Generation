import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class BarFrame implements Icon {

	private int width;
	private int height;
	private Color color;

	BarFrame(int height) {
		this.width = 25;
		this.height = height;
		this.color = Color.BLUE;

	}

	public int getIconHeight() {
		return height;
	}

	public int getIconWidth() {
		return width;
	}

	public void setIconHeight(int newHeight) {
		height = newHeight;
	}

	public void paintIcon(Component _comp, Graphics _graphics, int x, int y) {
		Graphics2D g2 = (Graphics2D) _graphics;
		Rectangle2D.Double rectangle = new Rectangle2D.Double(x, y, width, height);
		g2.setColor(color);

		g2.fill(rectangle);

	}

	public void setNewColor(Color color) {
		this.color = color;
	}

}
