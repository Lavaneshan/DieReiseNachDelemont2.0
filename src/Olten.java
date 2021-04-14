import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Olten extends JLabel {
	
	protected Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

	public Olten() {
		
		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setBounds(30, 420, 120, 90);
		this.setBackground(Color.orange);
		this.setOpaque(true);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setIcon(new ImageIcon(".\\src\\Bilder\\Olten.png"));
	}

}
