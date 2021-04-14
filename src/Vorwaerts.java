import java.awt.*;

import javax.swing.*;

public class Vorwaerts extends JButton{

	public Vorwaerts() {
		
		this.setText("vorwärts");	
		this.setBounds(650, 500, 100, 30);
		this.setVisible(true);
		this.setBackground(Color.white);
		this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

	}
}	