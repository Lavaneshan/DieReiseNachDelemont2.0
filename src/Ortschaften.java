

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ortschaften extends JPanel {

	private Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	private JLabel HintergrundBild = new JLabel();
	private int x;
	private int y;

	public Ortschaften(ImageIcon label, int x, int y) {
		super();
		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setOpaque(true);
		this.setVisible(true);
		this.add(HintergrundBild);
		HintergrundBild.setIcon(label);
		this.setSize(120, 90);
		this.x = x;
		this.y = y;
		this.setLocation(getX(), getY());
		this.add(new FIgurBlau());

	}

	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

}