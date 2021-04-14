import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

public class Label extends JLabel{
	
	
	public Label() {
		
		this.setBorder(new EmptyBorder(20,20,20,20));
		AbstractBorder border= new TextBubbleBorder(Color.black,2,16,0);
		this.setBorder(border);
		this.setSize(50,50);
		
	}

}
