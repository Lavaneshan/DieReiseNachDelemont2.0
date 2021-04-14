import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

//implements ActionListener
public class SpielerGui extends JFrame {
	JTextField spieler1_name = new JTextField(" Spieler 1");
	JTextField spieler2_name = new JTextField(" Spieler 2 ");
	JButton spieler1 = new JButton("1");
	JButton spieler2 = new JButton("2");

	Vorwaerts weiter = new Vorwaerts();
	Zurueck abbrechen = new Zurueck();

	public SpielerGui() {
	
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(800, 600);
		this.setLayout(null);

		this.add(spieler1_name);
		spieler1_name.setBounds(200, 100, 400, 100);
		spieler1_name.setVisible(true);
		spieler1_name.setBorder(BorderFactory.createLineBorder(Color.black));
		spieler1_name.setFont(new Font("Verdana", Font.PLAIN, 20));

		this.add(spieler1);
		spieler1.setBounds(200, 300, 200, 100);
		spieler1.setFont(new Font("Verdana", Font.PLAIN, 20));
		spieler1.setBackground(Color.blue);
		spieler1.setForeground(Color.white);

		this.add(spieler2_name);
		spieler2_name.setBounds(200, 100, 400, 100);
		spieler2_name.setVisible(false);
		spieler2_name.setBorder(BorderFactory.createLineBorder(Color.black));
		spieler2_name.setFont(new Font("Verdana", Font.PLAIN, 20));

		this.add(spieler2);
		spieler2.setBounds(450, 300, 200, 100);
		spieler2.setFont(new Font("Verdana", Font.PLAIN, 20));
		spieler2.setBackground(Color.yellow);
		spieler2.setForeground(Color.black);

		this.add(abbrechen);
		abbrechen.addActionListener(zurueck);

		this.add(weiter);
		weiter.addActionListener(vorwaerts);
	}

	ActionListener zurueck = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			SpielerLogik logik = new SpielerLogik();
			logik.Zurueck();

		}
	};
	ActionListener vorwaerts = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			SpielerLogik logik = new SpielerLogik();
			logik.Vorwaerts();

		}
	};
}
