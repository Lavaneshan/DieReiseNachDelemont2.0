

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SpielFeldLogik {

	ArrayList<Field> fields = new ArrayList<Field>();

	FIgurBlau blau;
	Würfeln wurfel;
	SpielFeldGui gui;

	public SpielFeldLogik() {

		System.out.println(fields.get(1));
		for (int i = 1; i <= 20; i++) {
			wurfel.getFeld();
			fields.get(wurfel.getFeld());
			System.out.println("Feld logik: " + wurfel.getFeld());

		}

	}
	public static void main(String[] args) {
		SpielFeldLogik logik= new SpielFeldLogik();
	}

}
