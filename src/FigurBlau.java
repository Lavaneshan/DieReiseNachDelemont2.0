
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FigurBlau extends JLabel {

	public FigurBlau() {

		this.setBounds(90, 420, 60, 90);
		this.setIcon(new ImageIcon(".\\src\\Bilder\\Blaue_Spielfigur.png"));
		this.setVisible(true);
		this.setOpaque(false);

	}

}
