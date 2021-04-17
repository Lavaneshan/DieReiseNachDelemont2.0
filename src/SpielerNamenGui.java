
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SpielerNamenGui extends JFrame implements ActionListener{

	JTextField TextSpieler1 = new JTextField("Spieler 1");
	JTextField TextSpieler2 = new JTextField("Spieler 2");
	JButton ButtonFigurBlau = new JButton(" Blau ");
	JButton ButtonFigurGelb = new JButton(" Gelb ");
	JButton weiter= new JButton("weiter");

	public SpielerNamenGui() {

		this.setVisible(true);
		this.setResizable(false);
		this.setSize(800, 600);
		this.setLayout(null);
		this.setTitle("Spielernamen");

		TextSpieler1.setBounds(220, 100, 400, 100);
		TextSpieler1.setVisible(true);
		TextSpieler1.setBorder(BorderFactory.createLineBorder(Color.black));
		TextSpieler1.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.add(TextSpieler1);
		

		TextSpieler2.setBounds(220, 100, 400, 100);
		TextSpieler2.setVisible(false);
		TextSpieler2.setBorder(BorderFactory.createLineBorder(Color.black));
		TextSpieler2.setFont(new Font("Verdana", Font.PLAIN, 20));
		this.add(TextSpieler2);

		ButtonFigurBlau.setBounds(200, 300, 200, 100);
		ButtonFigurBlau.setFont(new Font("Verdana", Font.PLAIN, 20));
		ButtonFigurBlau.setBackground(Color.blue);
		ButtonFigurBlau.setForeground(Color.white);
		this.add(ButtonFigurBlau);
		ButtonFigurBlau.addActionListener(this);

		ButtonFigurGelb.setBounds(450, 300, 200, 100);
		ButtonFigurGelb.setFont(new Font("Verdana", Font.PLAIN, 20));
		ButtonFigurGelb.setBackground(Color.yellow);
		ButtonFigurGelb.setForeground(Color.black);
		this.add(ButtonFigurGelb);
		ButtonFigurGelb.addActionListener(this);
		
		weiter.setBounds(650, 500, 100, 30);
		weiter.setVisible(false);
		weiter.setBackground(Color.white);
		weiter.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		this.add(weiter);
		weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				SpielFeldGui gui= new SpielFeldGui();
				
			}
		});
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (TextSpieler1.isVisible()) {
			TextSpieler1.getText();
			if(e.getSource()== ButtonFigurBlau) {
				ButtonFigurBlau.setText(TextSpieler1.getText());
				ButtonFigurBlau.setEnabled(false);
			}
			else if(e.getSource()==ButtonFigurGelb){
				ButtonFigurGelb.setText(TextSpieler1.getText());
				ButtonFigurGelb.setEnabled(false);
			}
			TextSpieler1.setVisible(false);
			TextSpieler2.setVisible(true);
			
		}
		else if(TextSpieler2.isVisible()){
			TextSpieler2.getText();
			if(e.getSource()== ButtonFigurBlau) {
				ButtonFigurBlau.setText(TextSpieler2.getText());
				ButtonFigurBlau.setEnabled(false);
			}
			else if(e.getSource()==ButtonFigurGelb){
				ButtonFigurGelb.setText(TextSpieler2.getText());
				ButtonFigurGelb.setEnabled(false);
			}
			weiter.setVisible(true);
			
		}
	}
		

		
		
		
	
}
