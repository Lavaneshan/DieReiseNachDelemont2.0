
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SpielerNamenGui extends JFrame implements ActionListener {

	JButton ButtonFigurBlau = new JButton(" Blau ");
	JButton ButtonFigurRot = new JButton(" Rot ");
	JButton weiter = new JButton("weiter");
	JLabel BildBlau = new JLabel();
	JLabel BildRot = new JLabel();
	int klick = 1;

	public SpielerNamenGui() {

		this.setVisible(true);
		this.setResizable(false);
		this.setSize(800, 600);
		this.setLayout(null);
		this.setTitle("Spielernamen");

		BildBlau.setBounds(275, 100, 300, 300);
		BildBlau.setIcon(new ImageIcon(".\\src\\Bilder\\Blaue_Spielfigur.png"));
		this.add(BildBlau);

		BildRot.setBounds(525, 100, 300, 300);
		BildRot.setIcon(new ImageIcon(".\\src\\Bilder\\Rote_Spielfigur.png"));
		this.add(BildRot);

		ButtonFigurBlau.setBounds(200, 300, 200, 100);
		ButtonFigurBlau.setFont(new Font("Verdana", Font.PLAIN, 20));
		ButtonFigurBlau.setBackground(Color.blue);
		ButtonFigurBlau.setForeground(Color.white);
		this.add(ButtonFigurBlau);
		ButtonFigurBlau.addActionListener(this);

		ButtonFigurRot.setBounds(450, 300, 200, 100);
		ButtonFigurRot.setFont(new Font("Verdana", Font.PLAIN, 20));
		ButtonFigurRot.setBackground(Color.red);
		ButtonFigurRot.setForeground(Color.black);
		this.add(ButtonFigurRot);
		ButtonFigurRot.addActionListener(this);

		weiter.setBounds(650, 500, 100, 30);
		weiter.setVisible(false);
		weiter.setBackground(Color.white);
		weiter.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		this.add(weiter);
		weiter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				SpielFeldGui gui = new SpielFeldGui();

			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (klick == 1) {

			if (e.getSource() == ButtonFigurBlau) {
				ButtonFigurBlau.setText("Spieler 1");
				ButtonFigurBlau.setEnabled(false);

			} else if (e.getSource() == ButtonFigurRot) {
				ButtonFigurRot.setText("Spieler 1");
				ButtonFigurRot.setEnabled(false);

			}
			klick++;

		} else if (klick == 2) {

			if (e.getSource() == ButtonFigurBlau) {
				ButtonFigurBlau.setText("Spieler 2");
				ButtonFigurBlau.setEnabled(false);

			} else if (e.getSource() == ButtonFigurRot) {
				ButtonFigurRot.setText("Spieler 2");
				ButtonFigurRot.setEnabled(false);

			}

		}

		weiter.setVisible(true);

	}
}
