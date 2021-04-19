
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FigurRot extends JLabel {

	int x;
	int y;
	int abstand = 20;

	public FigurRot() {

		this.setBounds(30, 420, 70, 70);

		this.setIcon(new ImageIcon(".\\src\\Bilder\\Rote_Spielfigur.png"));
		this.setVisible(true);
		this.setOpaque(false);

	}

}