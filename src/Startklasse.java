
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Startklasse extends JFrame implements ActionListener {

	JPanel background = new JPanel();

	JLabel titel = new JLabel();
	JButton start = new JButton("Start");

	public static void main(String[] args) {

		Startklasse start = new Startklasse();
	}

	public Startklasse() {
		this.setVisible(true);
		this.setSize(800, 600);
		background.setBackground(new Color(255, 255, 255));
		background.setBounds(getBounds());
		titel.setIcon(new ImageIcon(".\\src\\Bilder\\logo2.jpg"));
		background.setVisible(true);
		background.setLayout(null);
		this.setResizable(false);
		this.setTitle("start");
		this.add(background);

		titel.setBounds(50, 0, 800, 400);
		titel.setAlignmentX(CENTER_ALIGNMENT);
		titel.setVisible(true);

		// startknopf
		start.addActionListener(this);
		start.setBounds(300, 410, 200, 80);
		start.setFont(new Font("Verdana", Font.PLAIN, 20));
		start.setBackground(Color.blue);
		start.setForeground(Color.white);

		background.add(titel);
		background.add(start);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		SpielerNamenGui sg = new SpielerNamenGui();

		// Startfenster schliessen
	}

}
