import javax.swing.*;
import javax.swing.JLabel;

public class SpielFigurenGui extends JLabel{
	
	JLabel LabelSpielFigurBlau = new JLabel();
	JLabel LabelSpielFigurGelb = new JLabel();
	public SpielFigurenGui() {
		
	this.setVisible(true);
	this.setOpaque(false);
	this.setSize(120,90);
		
	LabelSpielFigurBlau.setBounds(30, 430, 90, 90);
	LabelSpielFigurBlau.setIcon(new ImageIcon(".\\src\\Bilder\\Blaue_Spielfigur.png"));
	LabelSpielFigurBlau.setVisible(true);
	LabelSpielFigurBlau.setOpaque(true);
	this.add(LabelSpielFigurBlau);
	
	LabelSpielFigurGelb.setBounds(90, 430, 90, 90);
	LabelSpielFigurGelb.setIcon(new ImageIcon(".\\src\\Bilder\\Rote_Spielfigur.png"));
	LabelSpielFigurGelb.setVisible(true);
	LabelSpielFigurGelb.setOpaque(true);
	this.add(LabelSpielFigurGelb);
	
//	
	}
}
