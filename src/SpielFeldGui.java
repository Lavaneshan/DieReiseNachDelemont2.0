

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpielFeldGui extends JFrame {

	JLabel labelArrow1 = new JLabel();
	JLabel labelArrow2 = new JLabel();
	JLabel labelArrow3 = new JLabel();
	JLabel hintergrundBild = new JLabel();

	Würfeln buttonWürfel = new Würfeln();
	Aufgeben buttonAufgeben= new Aufgeben();
	Scoreboard labelScoarboard = new Scoreboard();
	JPanel scorePanel = new JPanel();
	
	JPanel backgroundPanel = new JPanel();

	JPanel olten = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Olten.png"), 30,420);
	JPanel tecknau = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Tecknau.png"), 150, 420);
	JPanel gelterkinden = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Gelterkinden.png"), 270, 420);
	JPanel sissach = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Sissach.png"), 390, 420);
	JPanel itingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Itingen.png"), 510, 420);
	JPanel lausen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Lausen.png"), 630, 420);
	JPanel liestal = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Liestal.png"), 630, 330);
	JPanel frenkendorf = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Frenkendorf.png"), 630, 240);
	JPanel pratteln = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Pratteln.png"), 510, 240);
	JPanel muttenz = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Muttenz.png"), 390, 240);
	JPanel basel = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Basel.png"), 270, 240);
	JPanel dreispitz = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Dreispitz.png"), 150, 240);
	JPanel muenchenstein = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Münchenstein.png"), 30, 240);
	JPanel arlesheim = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Dornach.png"), 30, 150);
	JPanel aesch = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Aesch.png"), 30, 60);
	JPanel duggingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Duggingen.png"), 150, 60);
	JPanel grellingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Grellingen.png"), 270, 60);
	JPanel zwingen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Zwingen.png"), 390, 60);
	JPanel laufen = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Laufen.jpg"), 510, 60);
	JPanel delemont = new Ortschaften(new ImageIcon(".\\src\\Bilder\\Delémont.png"), 630, 60);
	JPanel fieldPanel = new JPanel();

	public SpielFeldGui() {

		hintergrundBild.setIcon(new ImageIcon(".\\src\\Bilder\\Karte.png"));

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

		scorePanel.add(labelScoarboard);
		scorePanel.add(buttonWürfel);
		scorePanel.add(buttonAufgeben);
		this.add(scorePanel);
		
		fieldPanel.setLayout(null);
		fieldPanel.setBounds(0, 0, 800, 600);
		fieldPanel.setVisible(true);
		fieldPanel.setOpaque(false);

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
		this.add(fieldPanel);

		this.add(backgroundPanel);
		backgroundPanel.setBounds(0, 0, 1000, 600);
		backgroundPanel.setVisible(true);
		backgroundPanel.add(hintergrundBild);

		this.setTitle("Die phantastische Reise nach Delémont");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(this);

	}
	

}