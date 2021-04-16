
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

public class Würfeln extends JButton implements ActionListener {

	protected Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

	int Würfeln;

	public Würfeln() {

		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setBounds(800, 60, 150, 150);
		this.setBackground(Color.white);
		this.setText("Würfeln");
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVisible(true);
		this.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Random r = new Random();
		Würfeln = r.nextInt(6) + 1;
		System.out.println(Würfeln);

		if (e.getSource() == this) {

			if (Würfeln == 1) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\Würfel1.png"));
				this.setText("");
				

			} else if (Würfeln == 2) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\Würfel2.png"));
				this.setText("");
			} else if (Würfeln == 3) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\Würfel3.png"));
				this.setText("");
			} else if (Würfeln == 4) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\Würfel4.png"));
				this.setText("");
			} else if (Würfeln == 5) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\Würfel5.png"));
				this.setText("");
			} else if (Würfeln == 6) {
				this.setIcon(new ImageIcon(".\\src\\Bilder\\Würfel6.png"));
				this.setText("");
			}

		}

	}
}
