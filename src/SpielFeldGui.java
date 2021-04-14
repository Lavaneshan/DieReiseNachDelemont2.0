import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SpielFeldGui extends JFrame {

	JLabel LabelArrow1 = new JLabel();
	JLabel LabelArrow2 = new JLabel();
	JLabel LabelArrow3 = new JLabel();
	JLabel HintergrundBild= new JLabel();
	

	public SpielFeldGui() {

		Olten LabelOlten = new Olten();
		Tecknau LabelTecknau = new Tecknau();
		Gelterkinden LabelGelterkinden = new Gelterkinden();
		Sissach LabelSissach = new Sissach();
		Itingen LabelItingen = new Itingen();
		Lausen LabelLausen = new Lausen();
		Liestal LabelLiestal = new Liestal();
		Frenkendorf LabelFrenkendorf = new Frenkendorf();
		Pratteln LabelPratteln = new Pratteln();
		Muttenz LabelMuttenz = new Muttenz();
		Basel LabelBasel = new Basel();
		Dreispitz LabelDreispitz = new Dreispitz();
		Münchenstein LabelMünchenstein = new Münchenstein();
		Arlesheim LabelArlesheim = new Arlesheim();
		Aesch LabelAesch = new Aesch();
		Duggingen LabelDuggingen = new Duggingen();
		Grellingen LabelGrellingen = new Grellingen();
		Zwingen LabelZwingen = new Zwingen();
		Laufen LabelLaufen = new Laufen();
		Delemont LabelDelemont = new Delemont();
		Würfeln ButtonWürfel = new Würfeln();
		Aufgeben ButtonAufgeben = new Aufgeben();
		
	
		HintergrundBild.setIcon(new ImageIcon(".\\src\\Bilder\\Karte.png"));
		this.setTitle("Die phantastische Reise nach Delémont");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(this);
		


		LabelArrow1.setBounds(530, 330, 120, 90);
		LabelArrow1.setIcon(new ImageIcon(".\\src\\Bilder\\Arrow.png"));
		this.add(LabelArrow1);
		
		LabelArrow2.setBounds(530, 150, 120, 90);
		LabelArrow2.setIcon(new ImageIcon(".\\src\\Bilder\\ArrowUp.png"));
		this.add(LabelArrow2);
		
		LabelArrow3.setBounds(160, 150, 120, 90);
		LabelArrow3.setIcon(new ImageIcon(".\\src\\Bilder\\Arrow.png"));
		this.add(LabelArrow3);

		
		this.add(ButtonWürfel);
		this.add(ButtonAufgeben);
		this.add(LabelOlten);
		this.add(LabelTecknau);
		this.add(LabelGelterkinden);
		this.add(LabelSissach);
		this.add(LabelItingen);
		this.add(LabelLausen);
		this.add(LabelLiestal);
		this.add(LabelFrenkendorf);
		this.add(LabelPratteln);
		this.add(LabelMuttenz);
		this.add(LabelBasel);
		this.add(LabelDreispitz);
		this.add(LabelMünchenstein);
		this.add(LabelArlesheim);
		this.add(LabelAesch);
		this.add(LabelDuggingen);
		this.add(LabelGrellingen);
		this.add(LabelZwingen);
		this.add(LabelLaufen);
		this.add(LabelDelemont);
		this.add(HintergrundBild);
	}

}
