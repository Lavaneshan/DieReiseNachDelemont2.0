import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.Border;

public class SpielFeldGui extends JFrame implements ActionListener {

	JLabel labelArrow1 = new JLabel();
	JLabel labelArrow2 = new JLabel();
	JLabel labelArrow3 = new JLabel();

	Aufgeben buttonAufgeben = new Aufgeben();
	JButton ResetButton = new JButton();
	JPanel scorePanel = new JPanel();
	FigurBlau fb = new FigurBlau();
	FigurRot fr = new FigurRot();
	Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	JButton buttonW�rfel = new JButton();
	SpielFeldLogik sfl = new SpielFeldLogik();
	SpielerNamenGui sgn;
	int W�rfeln = 1;
	int feld1 = 0;
	int feld2 = 0;
	int turn = 1;

	JLabel olten = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Olten.png"), 30, 420);
	JLabel tecknau = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Tecknau.png"), 150, 420);
	JLabel gelterkinden = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Gelterkinden.png"), 270, 420);
	JLabel sissach = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Sissach.png"), 390, 420);
	JLabel itingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Itingen.png"), 510, 420);
	JLabel lausen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Lausen.png"), 630, 420);
	JLabel liestal = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Liestal.png"), 630, 330);
	JLabel frenkendorf = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Frenkendorf.png"), 630, 240);
	JLabel pratteln = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Pratteln.png"), 510, 240);
	JLabel muttenz = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Muttenz.png"), 390, 240);
	JLabel basel = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Basel.png"), 270, 240);
	JLabel dreispitz = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Dreispitz.png"), 150, 240);
	JLabel muenchenstein = new Ortschaften(new ImageIcon(".\\src\\Bilder\\M�nchenstein.png"), 30, 240);
	JLabel arlesheim = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Dornach.png"), 30, 150);
	JLabel aesch = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Aesch.png"), 30, 60);
	JLabel duggingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Duggingen.png"), 150, 60);
	JLabel grellingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Grellingen.png"), 270, 60);
	JLabel zwingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Zwingen.png"), 390, 60);
	JLabel laufen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Laufen.jpg"), 510, 60);
	JLabel delemont = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Del�mont.png"), 630, 60);

	JPanel fieldPanel = new JPanel();

	public SpielFeldGui() {

		labelArrow1.setBounds(530, 330, 120, 90);
		labelArrow1.setIcon(new ImageIcon(".\\src\\Bilder\\Arrow.png"));

		labelArrow2.setBounds(530, 150, 120, 90);
		labelArrow2.setIcon(new ImageIcon(".\\src\\Bilder\\ArrowUp.png"));

		labelArrow3.setBounds(160, 150, 120, 90);
		labelArrow3.setIcon(new ImageIcon(".\\src\\Bilder\\Arrow.png"));

		scorePanel.setLayout(null);
		scorePanel.setBounds(800, 0, 300, 600);
		scorePanel.setVisible(true);
		scorePanel.setOpaque(false);

		scorePanel.add(ResetButton);
		scorePanel.add(buttonW�rfel);
		scorePanel.add(buttonAufgeben);

		fieldPanel.setLayout(null);
		fieldPanel.setBounds(0, 0, 800, 600);
		fieldPanel.setVisible(true);
		fieldPanel.setOpaque(false);

		fb.setLocation(olten.getLocation());
		fr.setLocation(olten.getX() + 50, olten.getY() + 10);
		fieldPanel.add(fr);
		fieldPanel.add(fb);
		fieldPanel.add(olten);
		fieldPanel.add(tecknau);
		fieldPanel.add(gelterkinden);
		fieldPanel.add(sissach);
		fieldPanel.add(itingen);
		fieldPanel.add(lausen);
		fieldPanel.add(liestal);
		fieldPanel.add(frenkendorf);
		fieldPanel.add(pratteln);
		fieldPanel.add(muttenz);
		fieldPanel.add(basel);
		fieldPanel.add(dreispitz);
		fieldPanel.add(muenchenstein);
		fieldPanel.add(arlesheim);
		fieldPanel.add(aesch);
		fieldPanel.add(duggingen);
		fieldPanel.add(grellingen);
		fieldPanel.add(zwingen);
		fieldPanel.add(laufen);
		fieldPanel.add(delemont);

		fieldPanel.add(labelArrow1);
		fieldPanel.add(labelArrow2);
		fieldPanel.add(labelArrow3);

		ResetButton.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		ResetButton.setBorder(border);
		ResetButton.setBounds(0, 210, 150, 150);
		ResetButton.setOpaque(true);
		ResetButton.setVisible(true);
		ResetButton.setBackground(Color.white);
		ResetButton.setText("Reset");

		ResetButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				W�rfeln = 1;
				feld1 = 0;
				feld2 = 0;
				turn = 1;

				fr.setLocation(olten.getX() + 50, olten.getY() + 10);
				fb.setLocation(olten.getLocation());
				SpielFeldGui sf = null;
				JOptionPane.showMessageDialog(sf, "Spiel f�ngt wieder von vorn an!");
			}
		}

		);

		buttonW�rfel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		buttonW�rfel.setBorder(border);
		buttonW�rfel.setBounds(0, 60, 150, 150);
		buttonW�rfel.setBackground(Color.white);
		buttonW�rfel.setText("W�rfeln");
		buttonW�rfel.setHorizontalAlignment(JLabel.CENTER);
		buttonW�rfel.setVisible(true);
		buttonW�rfel.addActionListener(this);

		this.setTitle("Die phantastische Reise nach Del�mont");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		try {
			this.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("./src/Bilder/Karte.png")))));
		} catch (IOException e) {

			e.printStackTrace();
		}
		this.setSize(1000, 600);
		this.setLayout(null);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(this);
		this.add(scorePanel);
		this.add(fieldPanel);

	}

	public void actionPerformed(ActionEvent e) {

		if (turn == 1 || turn == 3 || turn == 5 || turn == 7 || turn == 9 || turn == 11 || turn == 13 || turn == 15
				|| turn == 17 || turn == 19) {

			this.MoveRed();
			this.AktionWurfel();
			this.feld2 = getFeld2() + W�rfeln;

			this.GewinnerRot();

		} else if (turn == 2 || turn == 4 || turn == 6 || turn == 8 || turn == 10 || turn == 12 || turn == 14
				|| turn == 16 || turn == 18 || turn == 20) {

			this.MoveBlue();
			this.AktionWurfel();
			this.feld1 = getFeld1() + W�rfeln;

			this.GewinnerBlau();

		}
		turn++;

	}

	public void AktionWurfel() {

		Random r = new Random();
		W�rfeln = r.nextInt(6) + 1;

		if (W�rfeln == 1) {

			buttonW�rfel.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel1.png"));
			buttonW�rfel.setText("");

		} else if (W�rfeln == 2) {

			buttonW�rfel.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel2.png"));
			buttonW�rfel.setText("");

		} else if (W�rfeln == 3) {

			buttonW�rfel.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel3.png"));
			buttonW�rfel.setText("");

		} else if (W�rfeln == 4) {

			buttonW�rfel.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel4.png"));
			buttonW�rfel.setText("");

		} else if (W�rfeln == 5) {

			buttonW�rfel.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel5.png"));
			buttonW�rfel.setText("");

		} else if (W�rfeln == 6) {
			buttonW�rfel.setIcon(new ImageIcon(".\\src\\Bilder\\W�rfel6.png"));
			buttonW�rfel.setText("");

		}

	}

	public void MoveBlue() {

		if (sfl.fields.get(feld1) == "olten") {

			this.fb.setLocation(olten.getLocation());

		} else if (sfl.fields.get(feld1) == "tecknau") {

			this.fb.setLocation(tecknau.getLocation());

		} else if (sfl.fields.get(feld1) == "gelterkinden") {

			this.fb.setLocation(gelterkinden.getLocation());

		} else if (sfl.fields.get(feld1) == "sissach") {

			this.fb.setLocation(sissach.getLocation());

		} else if (sfl.fields.get(feld1) == "itingen") {

			this.fb.setLocation(itingen.getLocation());
			JOptionPane.showMessageDialog(this, "Blau f�ngt an!");
			Gui TikTok = new Gui();

		} else if (sfl.fields.get(feld1) == "lausen") {

			this.fb.setLocation(lausen.getLocation());

		} else if (sfl.fields.get(feld1) == "liestal") {

			this.fb.setLocation(liestal.getLocation());

		} else if (sfl.fields.get(feld1) == "frenkendorf") {

			this.fb.setLocation(frenkendorf.getLocation());

		} else if (sfl.fields.get(feld1) == "pratteln") {

			this.fb.setLocation(pratteln.getLocation());
			JOptionPane.showMessageDialog(this, "Blau f�ngt an!");
			VierGewinnt VierLara = new VierGewinnt();

		} else if (sfl.fields.get(feld1) == "muttenz") {

			this.fb.setLocation(muttenz.getLocation());

		} else if (sfl.fields.get(feld1) == "basel") {

			fb.setLocation(basel.getLocation());

		} else if (sfl.fields.get(feld1) == "dreispitz") {

			this.fb.setLocation(dreispitz.getLocation());
			JOptionPane.showMessageDialog(this, "Blau f�ngt an!");
			Gui TikTok = new Gui();

		} else if (sfl.fields.get(feld1) == "muenchenstein") {

			fb.setLocation(muenchenstein.getLocation());

		} else if (sfl.fields.get(feld1) == "arlesheim") {

			fb.setLocation(arlesheim.getLocation());

		} else if (sfl.fields.get(feld1) == "aesch") {

			fb.setLocation(aesch.getLocation());

		} else if (sfl.fields.get(feld1) == "duggingen") {

			fb.setLocation(duggingen.getLocation());
			JOptionPane.showMessageDialog(this, "Blau f�ngt an!");
			VierGewinnt VierLara = new VierGewinnt();

		} else if (sfl.fields.get(feld1) == "grellingen") {

			fb.setLocation(grellingen.getLocation());

		} else if (sfl.fields.get(feld1) == "zwingen") {

			fb.setLocation(zwingen.getLocation());

		} else if (sfl.fields.get(feld1) == "laufen") {

			fb.setLocation(laufen.getLocation());
			JOptionPane.showMessageDialog(this, "Blau f�ngt an!");
			Gui TikTok = new Gui();

		} else if (sfl.fields.get(feld1) == "delemont") {

			fb.setLocation(delemont.getLocation());

		}
	}

	public void GewinnerBlau() {

		if (feld1 == 15 && W�rfeln == 6 || feld1 == 16 && W�rfeln == 6 || feld1 == 17 && W�rfeln == 6
				|| feld1 == 18 && W�rfeln == 6 || feld1 == 19 && W�rfeln == 6) {

			fb.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Blau hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld1 == 16 && W�rfeln == 5 || feld1 == 17 && W�rfeln == 5 || feld1 == 18 && W�rfeln == 5
				|| feld1 == 19 && W�rfeln == 5) {

			fb.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Blau hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld1 == 17 && W�rfeln == 4 || feld1 == 18 && W�rfeln == 4 || feld1 == 19 && W�rfeln == 4) {

			fb.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Blau hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld1 == 18 && W�rfeln == 3 || feld1 == 19 && W�rfeln == 3) {

			fb.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Blau hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld1 == 19 && W�rfeln == 2) {

			fb.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Blau hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		}

	}

	public void MoveRed() {

		if (sfl.fields.get(feld2) == "olten") {

			this.fr.setLocation(olten.getX() + 50, olten.getY() + 10);

		} else if (sfl.fields.get(feld2) == "tecknau") {

			this.fr.setLocation(tecknau.getX() + 50, tecknau.getY() + 10);

		} else if (sfl.fields.get(feld2) == "gelterkinden") {

			this.fr.setLocation(gelterkinden.getX() + 50, gelterkinden.getY() + 10);

		} else if (sfl.fields.get(feld2) == "sissach") {

			this.fr.setLocation(sissach.getX() + 50, sissach.getY() + 10);

		} else if (sfl.fields.get(feld2) == "itingen") {

			this.fr.setLocation(itingen.getX() + 50, itingen.getY() + 10);
			JOptionPane.showMessageDialog(this, "Rot f�ngt an!");
			Gui TikTok = new Gui();

		} else if (sfl.fields.get(feld2) == "lausen") {

			this.fr.setLocation(lausen.getX() + 50, lausen.getY() + 10);

		} else if (sfl.fields.get(feld2) == "liestal") {

			this.fr.setLocation(liestal.getX() + 50, liestal.getY() + 10);

		} else if (sfl.fields.get(feld2) == "frenkendorf") {

			this.fr.setLocation(frenkendorf.getX() + 50, frenkendorf.getY() + 10);

		} else if (sfl.fields.get(feld2) == "pratteln") {

			this.fr.setLocation(pratteln.getX() + 50, pratteln.getY() + 10);
			JOptionPane.showMessageDialog(this, "Rot f�ngt an!");
			VierGewinnt VierLara = new VierGewinnt();

		} else if (sfl.fields.get(feld2) == "muttenz") {

			this.fr.setLocation(muttenz.getX() + 50, muttenz.getY() + 10);

		} else if (sfl.fields.get(feld2) == "basel") {

			this.fr.setLocation(basel.getX() + 50, basel.getY() + 10);

		} else if (sfl.fields.get(feld2) == "dreispitz") {

			this.fr.setLocation(dreispitz.getX() + 50, dreispitz.getY() + 10);
			JOptionPane.showMessageDialog(this, "Rot f�ngt an!");
			Gui TikTok = new Gui();

		} else if (sfl.fields.get(feld2) == "muenchenstein") {

			this.fr.setLocation(muenchenstein.getX() + 50, muenchenstein.getY() + 10);

		} else if (sfl.fields.get(feld2) == "arlesheim") {

			this.fr.setLocation(arlesheim.getX() + 50, arlesheim.getY() + 10);

		} else if (sfl.fields.get(feld2) == "aesch") {

			this.fr.setLocation(aesch.getX() + 50, aesch.getY() + 10);

		} else if (sfl.fields.get(feld2) == "duggingen") {

			this.fr.setLocation(duggingen.getX() + 50, duggingen.getY() + 10);
			JOptionPane.showMessageDialog(this, "Rot f�ngt an!");
			VierGewinnt VierLara = new VierGewinnt();

		} else if (sfl.fields.get(feld2) == "grellingen") {

			this.fr.setLocation(grellingen.getX() + 50, grellingen.getY() + 10);

		} else if (sfl.fields.get(feld2) == "zwingen") {

			this.fr.setLocation(zwingen.getX() + 50, zwingen.getY() + 10);

		} else if (sfl.fields.get(feld2) == "laufen") {

			this.fr.setLocation(laufen.getX() + 50, laufen.getY() + 10);
			JOptionPane.showMessageDialog(this, "Rot f�ngt an!");
			Gui TikTok = new Gui();

		} else if (sfl.fields.get(feld2) == "delemont") {

			this.fr.setLocation(delemont.getX() + 50, delemont.getY() + 10);

		}
	}

	public void GewinnerRot() {

		if (feld2 == 15 && W�rfeln == 6 || feld2 == 16 && W�rfeln == 6 || feld2 == 17 && W�rfeln == 6
				|| feld2 == 18 && W�rfeln == 6 || feld2 == 19 && W�rfeln == 6) {

			fr.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Rot hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld2 == 16 && W�rfeln == 5 || feld2 == 17 && W�rfeln == 5 || feld2 == 18 && W�rfeln == 5
				|| feld2 == 19 && W�rfeln == 5) {

			fr.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Rot hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld2 == 17 && W�rfeln == 4 || feld2 == 18 && W�rfeln == 4 || feld2 == 19 && W�rfeln == 4) {

			fr.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Rot hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld2 == 18 && W�rfeln == 3 || feld2 == 19 && W�rfeln == 3) {

			fr.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Rot hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		} else if (feld2 == 19 && W�rfeln == 2) {

			fr.setLocation(delemont.getLocation());

			JOptionPane.showMessageDialog(null, "Rot hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);

		}
	}

	public int getFeld1() {
		return feld1;
	}

	public int getFeld2() {
		return feld2;
	}

}
