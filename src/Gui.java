

import java.awt.event.ActionEvent;
import java.awt.color.*;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Gui extends JFrame implements ActionListener {
	JButton t1, t2, t3, t4, t5, t6, t7, t8, t9, s1, b1, r1;
	int check1 = 0, check2 = 0, check3 = 0, check4 = 0, check5 = 0, check6 = 0, check7 = 0, check8 = 0, check9 = 0;
	int Gewinner;
	int player = 1;
	int wincheck;
	Action a1 = new Action();
	UIManager UI = new UIManager();

//GUI Grösse, Mittig gesetzt, Hintergrundfarbe
	public Gui() {
		this.setSize(310, 330);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.getContentPane().setBackground(Color.DARK_GRAY);
//Start Button eingesetzt, aktiviert, Farbe eingestellt		
		s1 = new JButton("Start");
		s1.setBounds(100, 100, 90, 20);
		s1.setBackground(Color.LIGHT_GRAY);
		this.add(s1);
		s1.addActionListener(this);
//Beenden Button eingesetzt, aktiviert, Farbe eingestellt		
		b1 = new JButton("Beenden");
		b1.setBounds(100, 130, 90, 20);
		b1.setBackground(Color.LIGHT_GRAY);
		b1.setEnabled(false);
		this.add(b1);
		b1.addActionListener(this);
//GUI Grösse kann man nicht verändern, Schliessoption, Titel des Programms, Ansehbar gemacht
		setResizable(isDisplayable());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("TicTacToe");
		this.setVisible(true);
	}

//Beenden Button bekommt die Funktion, dass sich das Programm schliesst wenn man draufklickt
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == b1) {
			System.exit(0);
		}
//Start Button bekommt die Funktion, dass sich die anderen 9 Buttons zeigen wenn man draufklickt und der Start/Beenden Button unsiegbar wird
		if (event.getSource() == s1) {
			//Start Knopf wird unsiegbar gemacht
			s1.setVisible(false);
			//Button 1 wird initialisiert und angezeigt
			t1 = new JButton("");
			t1.setBounds(20, 20, 80, 80);
			t1.setBackground(Color.LIGHT_GRAY);
			this.add(t1);
			t1.addActionListener(this);
			//Button 2 wird initialisiert und angezeigt
			t2 = new JButton("");
			t2.setBounds(110, 20, 80, 80);
			t2.setBackground(Color.LIGHT_GRAY);
			this.add(t2);
			t2.addActionListener(this);
			//Button 3 wird initialisiert und angezeigt
			t3 = new JButton("");
			t3.setBounds(200, 20, 80, 80);
			t3.setBackground(Color.LIGHT_GRAY);
			this.add(t3);
			t3.addActionListener(this);
			//Button 4 wird initialisiert und angezeigt
			t4 = new JButton("");
			t4.setBounds(20, 110, 80, 80);
			t4.setBackground(Color.LIGHT_GRAY);
			this.add(t4);
			t4.addActionListener(this);
			//Button 5 wird initialisiert und angezeigt
			t5 = new JButton("");
			t5.setBounds(110, 110, 80, 80);
			t5.setBackground(Color.LIGHT_GRAY);
			this.add(t5);
			t5.addActionListener(this);
			//Button 6 wird initialisiert und angezeigt
			t6 = new JButton("");
			t6.setBounds(200, 110, 80, 80);
			t6.setBackground(Color.LIGHT_GRAY);
			this.add(t6);
			t6.addActionListener(this);
			//Button 7 wird initialisiert und angezeigt
			t7 = new JButton("");
			t7.setBounds(20, 200, 80, 80);
			t7.setBackground(Color.LIGHT_GRAY);
			this.add(t7);
			t7.addActionListener(this);
			//Button 8 wird initialisiert und angezeigt
			t8 = new JButton("");
			t8.setBounds(110, 200, 80, 80);
			t8.setBackground(Color.LIGHT_GRAY);
			this.add(t8);
			t8.addActionListener(this);
			//Button 9 wird initialisiert und angezeigt
			t9 = new JButton("");
			t9.setBounds(200, 200, 80, 80);
			t9.setBackground(Color.LIGHT_GRAY);
			this.add(t9);
			t9.addActionListener(this);
			//Beenden Knopf wird unsiegbar gemacht
			b1.setVisible(false);

// Button 1 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.
		}
		if (event.getSource() == t1) {
			if (player == 1) {
				t1.setEnabled(false);
				t1.setText("X");
				t1.setFont(new Font("", 0, 50));
				check1 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 1 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.				
			} else if (player == 2) {
				t1.setEnabled(false);
				t1.setText("O");
				t1.setFont(new Font("", 0, 50));
				player--;
				check1 = 2;

// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 2 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.
		if (event.getSource() == t2) {
			if (player == 1) {
				t2.setEnabled(false);
				t2.setText("X");
				t2.setFont(new Font("", 0, 50));
				check2 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 2 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t2.setEnabled(false);
				t2.setText("O");
				t2.setFont(new Font("", 0, 50));
				player--;
				check2 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 3 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.
		if (event.getSource() == t3) {
			if (player == 1) {
				t3.setEnabled(false);
				t3.setText("X");
				t3.setFont(new Font("", 0, 50));
				check3 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 3 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.	
			} else if (player == 2) {
				t3.setEnabled(false);
				t3.setText("O");
				t3.setFont(new Font("", 0, 50));
				player--;
				check3 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 4 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.		
		if (event.getSource() == t4) {
			if (player == 1) {
				t4.setEnabled(false);
				t4.setText("X");
				t4.setFont(new Font("", 0, 50));
				check4 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 4 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t4.setEnabled(false);
				t4.setText("O");
				t4.setFont(new Font("", 0, 50));
				player--;
				check4 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 5 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.		
		if (event.getSource() == t5) {
			if (player == 1) {
				t5.setEnabled(false);
				t5.setText("X");
				t5.setFont(new Font("", 0, 50));
				check5 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 5 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t5.setEnabled(false);
				t5.setText("O");
				t5.setFont(new Font("", 0, 50));
				player--;
				check5 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 6 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.
		if (event.getSource() == t6) {
			if (player == 1) {
				t6.setEnabled(false);
				t6.setText("X");
				t6.setFont(new Font("", 0, 50));
				check6 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 6 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t6.setEnabled(false);
				t6.setText("O");
				t6.setFont(new Font("", 0, 50));
				player--;
				check6 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 7 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.	
		if (event.getSource() == t7) {
			if (player == 1) {
				t7.setEnabled(false);
				t7.setText("X");
				t7.setFont(new Font("", 0, 50));
				check7 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 7 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t7.setEnabled(false);
				t7.setText("O");
				t7.setFont(new Font("", 0, 50));
				player--;
				check7 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 8 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.		
		if (event.getSource() == t8) {
			if (player == 1) {
				t8.setEnabled(false);
				t8.setText("X");
				t8.setFont(new Font("", 0, 50));
				check8 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 8 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t8.setEnabled(false);
				t8.setText("O");
				t8.setFont(new Font("", 0, 50));
				player--;
				check8 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
// Button 9 bekommt die Funktion, das X gesetzt wird. Spieler 1 (X) fängt an, Schriftgrösse wurde gesetzt.		
		if (event.getSource() == t9) {
			if (player == 1) {
				t9.setEnabled(false);
				t9.setText("X");
				t9.setFont(new Font("", 0, 50));
				check9 = 1;
				player++;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
// Button 9 bekommt die Funktion, das O gesetzt wird. Schriftgrösse wurde gesetzt.
			} else if (player == 2) {
				t9.setEnabled(false);
				t9.setText("O");
				t9.setFont(new Font("", 0, 50));
				player--;
				check9 = 2;
// Hier wird gecheckt ob jemand gewonnen hat mit der Klasse "Action"
				int wincheck = a1.checker(check1, check2, check3, check4, check5, check6, check7, check8, check9);
				winchecker(wincheck);
			}
		}
	}

//Hier wird sobald der Gewinner erkannt wird eine Meldung ausgeführt. Dieser giltet falls der Spieler 1 gewinnt.
	private void winchecker(int wincheck) {
		if (wincheck == 1) {

			UI.put("OptionPane.background", new ColorUIResource(64, 64, 64));
			UI.put("Panel.background", new ColorUIResource(64, 64, 64));
			UI.put("OptionPane.messageForeground", Color.white);
			JOptionPane.showMessageDialog(null, "X hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);
			dispose();
			
//Die Felder werden ausgeblendet damit man das Resultat nicht mehr verändern kann		
			t1.setEnabled(false);
			t2.setEnabled(false);
			t3.setEnabled(false);
			t4.setEnabled(false);
			t5.setEnabled(false);
			t6.setEnabled(false);
			t7.setEnabled(false);
			t8.setEnabled(false);
			t9.setEnabled(false);
//Hier wird sobald der Gewinner erkannt wird eine Meldung ausgeführt. Dieser giltet falls der Spieler 2 gewinnt.
		} else if (wincheck == 2) {
//OptinePane wird erstellt und dort steht eine Nachricht, wenn man auf "ok" klickt schliesst sie sich
			UI.put("OptionPane.background", new ColorUIResource(64, 64, 64));
			UI.put("Panel.background", new ColorUIResource(64, 64, 64));
			UI.put("OptionPane.messageForeground", Color.white);
			JOptionPane.showMessageDialog(null, "O hat gewonnen!", "Gewinner", JOptionPane.NO_OPTION);
			dispose();
			
//Die Felder werden ausgeblendet damit man das Resultat nicht mehr verändern kann		
			t1.setEnabled(false);
			t2.setEnabled(false);
			t3.setEnabled(false);
			t4.setEnabled(false);
			t5.setEnabled(false);
			t6.setEnabled(false);
			t7.setEnabled(false);
			t8.setEnabled(false);
			t9.setEnabled(false);
		}
		
		
	}
}