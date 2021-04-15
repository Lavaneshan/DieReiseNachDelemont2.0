import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SpielerGui2 extends JFrame {

	JTextField TextSpieler2 = new JTextField("Spieler 2");
	JButton ButtonFigur1 = new JButton(" Blau ");
	JButton ButtonFigur2 = new JButton(" Gelb ");
	JButton ButtonWeiter = new JButton();

	public SpielerGui2() {

		this.setVisible(false);
		this.setResizable(false);
		this.setSize(800, 600);
		this.setLayout(null);
		this.setTitle("Spieler 2");

		TextSpieler2.setBounds(220, 100, 400, 100);
		TextSpieler2.setVisible(true);
		TextSpieler2.setBorder(BorderFactory.createLineBorder(Color.black));
		TextSpieler2.setFont(new Font("Verdana", Font.PLAIN, 20));

		ButtonFigur1.setBounds(200, 300, 200, 100);
		ButtonFigur1.setFont(new Font("Verdana", Font.PLAIN, 20));
		ButtonFigur1.setBackground(Color.blue);
		ButtonFigur1.setForeground(Color.white);

		ButtonFigur2.setBounds(450, 300, 200, 100);
		ButtonFigur2.setFont(new Font("Verdana", Font.PLAIN, 20));
		ButtonFigur2.setBackground(Color.yellow);
		ButtonFigur2.setForeground(Color.black);

		ButtonWeiter.setText("weiter");
		ButtonWeiter.setBounds(650, 500, 100, 30);
		ButtonWeiter.setVisible(true);
		ButtonWeiter.setBackground(Color.white);
		ButtonWeiter.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

		this.add(TextSpieler2);
		this.add(ButtonFigur1);
		this.add(ButtonFigur2);
		this.add(ButtonWeiter);

	}

	public void Action() {

		ButtonFigur1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == ButtonFigur1)

					ButtonFigur1.setText(TextSpieler2.getText());
				ButtonFigur2.setEnabled(false);

			}

		});

		ButtonFigur2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == ButtonFigur2)

					ButtonFigur2.setText(TextSpieler2.getText());
				ButtonFigur1.setEnabled(false);

			}

		});
		ButtonWeiter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == ButtonWeiter) {

					SpielerGui2 sg2 = new SpielerGui2();
					setVisible(false);
					SpielFeldGui sf = new SpielFeldGui();
					

				}

			}

		});
	}

}
