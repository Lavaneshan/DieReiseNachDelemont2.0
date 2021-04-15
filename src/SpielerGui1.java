import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SpielerGui1 extends JFrame {

	JTextField TextSpieler1 = new JTextField("Spieler 1");
	JButton ButtonFigur1 = new JButton(" Blau ");
	JButton ButtonFigur2 = new JButton(" Gelb ");
	JButton ButtonWeiter = new JButton();
	SpielerGui2 sg2 = new SpielerGui2();

	public SpielerGui1() {

		this.setVisible(true);
		this.setResizable(false);
		this.setSize(800, 600);
		this.setLayout(null);
		this.setTitle("Spieler 1");

		TextSpieler1.setBounds(220, 100, 400, 100);
		TextSpieler1.setVisible(true);
		TextSpieler1.setBorder(BorderFactory.createLineBorder(Color.black));
		TextSpieler1.setFont(new Font("Verdana", Font.PLAIN, 20));

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

		this.add(ButtonWeiter);
		this.add(TextSpieler1);
		this.add(ButtonFigur1);
		this.add(ButtonFigur2);

	}

	public void Action() {

		ButtonFigur1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == ButtonFigur1)

					ButtonFigur1.setText(TextSpieler1.getText());
				sg2.ButtonFigur1.setText(TextSpieler1.getText());
				sg2.ButtonFigur1.setEnabled(false);
				ButtonFigur2.setEnabled(false);

			}

		});

		ButtonFigur2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == ButtonFigur2)

					ButtonFigur2.setText(TextSpieler1.getText());
				sg2.ButtonFigur2.setText(TextSpieler1.getText());
				sg2.ButtonFigur2.setEnabled(false);
				ButtonFigur1.setEnabled(false);

			}

		});
		ButtonWeiter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == ButtonWeiter) {
					setVisible(false);
					sg2.setVisible(true);
					sg2.Action();

				}

			}

		});
	}
}
