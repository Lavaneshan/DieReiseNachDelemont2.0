import java.awt.Color;

import javax.swing.*;

public class Zurueck extends JButton {

	public Zurueck() {
		this.setText("zurück");
		this.setBounds(20, 500, 100, 30);
		this.setVisible(true);
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	}

}
