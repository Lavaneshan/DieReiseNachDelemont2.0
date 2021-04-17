

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

public class W�rfeln extends JButton implements ActionListener {

	protected Border border = BorderFactory.createLineBorder(Color.BLACK, 1);

	int W�rfeln;
	SpielFeldGui gui;
	int feld=0;
	SpielFeldLogik logik;

	public W�rfeln() {

		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setBounds(0, 60, 150, 150);
		this.setBackground(Color.white);
		this.setText("W�rfeln");
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setVisible(true);
		this.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Random r = new Random();
		W�rfeln = r.nextInt(6) + 1;
		System.out.println(W�rfeln);

		if (e.getSource() == this) {

			if (W�rfeln == 1) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel1.png"));
				this.setText("");

			} else if (W�rfeln == 2) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel2.png"));
				this.setText("");

			} else if (W�rfeln == 3) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel3.png"));
				this.setText("");

			} else if (W�rfeln == 4) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel4.png"));
				this.setText("");

			} else if (W�rfeln == 5) {

				this.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel5.png"));
				this.setText("");

			} else if (W�rfeln == 6) {
				this.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel6.png"));
				this.setText("");

			}

		}
		
			this.feld = getFeld() + W�rfeln;
			System.out.println("Feld:" + feld);
			for (int i=0;i<=20; i++) {
				
				logik.fields.get(this.getFeld());
				System.out.println("Feld logik: " + this.getFeld());

			}
		

	}

	/**
	 * @return the w�rfeln
	 */
	public int getW�rfeln() {
		return W�rfeln;
	}

	/**
	 * @return the feld
	 */
	public int getFeld() {
		return feld;
	}

}
