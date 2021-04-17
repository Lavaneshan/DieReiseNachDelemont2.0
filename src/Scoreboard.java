

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Timer;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Scoreboard extends JLabel{

	protected Border border = BorderFactory.createLineBorder(Color.BLACK, 1);


	public Scoreboard() {

		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setBounds(0, 210, 150, 150);
		this.setOpaque(true);
		this.setBackground(Color.white);
		this.setText("Scoreboard");
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVisible(true);

	}

}
