import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ortschaften extends JLabel {

	private Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	JLabel HintergrundBild = new JLabel();

	int x;
	int y;


	public Ortschaften(ImageIcon label, int x, int y) {
		super();

		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setOpaque(true);
		this.setVisible(true);
		this.setSize(120, 90);
		this.x = x;
		this.y = y;
		this.setLocation(getX(), getY());
		this.setLayout(new GridBagLayout());
		HintergrundBild.setIcon(label);
		this.add(HintergrundBild);

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
