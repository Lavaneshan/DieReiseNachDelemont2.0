
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

public class Aufgeben extends JButton implements ActionListener {

	protected Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	UIManager UI = new UIManager();

	public Aufgeben() {

		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setBounds(0, 360, 150, 150);
		this.setBackground(Color.WHITE);
		this.setOpaque(true);
		this.setIcon(new ImageIcon(".\\src\\Bilder\\GiveUp.png"));

		this.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this) {

			int response = JOptionPane.showConfirmDialog(this, "Möchtest du wirklich das Spiel beenden?", "Aufgeben",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if (response == JOptionPane.YES_OPTION) {
				System.exit(0);
			} else if (response == JOptionPane.NO_OPTION) {

			} else if (response == JOptionPane.CLOSED_OPTION) {

			}

		}

	}

}
