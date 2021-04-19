
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SpielFeldLogik {

	ArrayList<String> fields = new ArrayList<String>();

	FigurBlau blau;
	SpielFeldGui gui;
	

	public SpielFeldLogik() {
		
	
		fields.add("olten");
		fields.add("tecknau");
		fields.add("gelterkinden");
		fields.add("sissach");
		fields.add("itingen");
		fields.add("lausen");
		fields.add("liestal");
		fields.add("frenkdendorf");
		fields.add("pratteln");
		fields.add("muttenz");
		fields.add("basel");
		fields.add("dreispitz");
		fields.add("muenchenstein");
		fields.add("arlesheim");
		fields.add("aesch");
		fields.add("duggingen");
		fields.add("grellingen");
		fields.add("zwingen");
		fields.add("laufen");
		fields.add("delemont");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");
		fields.add("fill");


	}

	public void setFields(ArrayList<String> fields) {
		this.fields = getFields();
	}

	public ArrayList<String> getFields() {
		return fields;
	}

}