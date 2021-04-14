
public class SpielerLogik {
	int klick = 0;
	SpielerGui gui = new SpielerGui();

	public SpielerLogik() {

	}

	public void Zurueck() {
		//klick++;
		if (klick == 1) {
			/*
			 * Spieler1_GUI spieler= new Spieler1_GUI(); spieler2.setText("2");
			 * spieler2_name.setVisible(false); spieler1_name.setVisible(true); klick++;
			 */
			gui.dispose();
			Startklasse main = new Startklasse();

			// -------------------------zuruck an die Verschiedene Fenster-----------------

		} else if (klick == 2) {
			SpielerGui spieler = new SpielerGui();
			// gui.spieler2.setText("2");
			gui.spieler2_name.setVisible(false);
			gui.spieler1_name.setVisible(true);
			klick++;
			// Start main= new Start();
		}
	}

	public void Vorwaerts() {
		klick++;
		if (klick == 1) {
			gui.spieler1_name.setVisible(false);
			gui.spieler2_name.setVisible(true);

			gui.spieler1.setText(gui.spieler1_name.getText());
			this.gui.spieler1 = gui.spieler1;
			klick++;
			System.out.println("klick"+ klick);

		} else if (klick == 2) {
			
			gui.spieler2.setText(gui.spieler2_name.getText());
			this.gui.spieler2=gui.spieler2;
			klick++;
			SpielfeldGui spielfeld= new SpielfeldGui();
			System.out.println("klick"+ klick);
			klick++;
		} else {
			gui.dispose();
			// SpielfeldGui spielfeld= new SpielfeldGui();

		}

	}

}
