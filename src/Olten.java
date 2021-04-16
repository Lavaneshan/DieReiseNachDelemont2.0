import java.awt.Color;

import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Olten extends JLayeredPane {

	protected Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
	JLabel Hintergrund = new JLabel();
	JLabel LabelSpielFigurBlau = new JLabel();
	JLabel LabelSpielFigurGelb = new JLabel();

	public Olten() {

		this.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		this.setBorder(border);
		this.setBounds(30, 420, 120, 90);
		this.setOpaque(true);
		this.setVisible(true);
		Hintergrund.setHorizontalAlignment(JLabel.CENTER);
		Hintergrund.setIcon(new ImageIcon(".\\src\\Bilder\\Olten.png"));
		this.add(Hintergrund,JLayeredPane.PALETTE_LAYER);
		
		LabelSpielFigurBlau.setBounds(30, 430, 90, 90);
		LabelSpielFigurBlau.setIcon(new ImageIcon(".\\src\\Bilder\\Blaue_Spielfigur.png"));
		LabelSpielFigurBlau.setVisible(true);
		LabelSpielFigurBlau.setOpaque(true);
		this.add(LabelSpielFigurBlau,JLayeredPane.MODAL_LAYER);

		LabelSpielFigurGelb.setBounds(90, 430, 90, 90);
		LabelSpielFigurGelb.setIcon(new ImageIcon(".\\src\\Bilder\\Rote_Spielfigur.png"));
		LabelSpielFigurGelb.setVisible(true);
		LabelSpielFigurGelb.setOpaque(true);
		this.add(LabelSpielFigurGelb,JLayeredPane.POPUP_LAYER);

	}

}
