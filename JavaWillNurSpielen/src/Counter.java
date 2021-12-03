import javax.swing.*;

import util.ShowInFrame;

import java.awt.event.*;
public class Counter extends SimpleButton{

	public Counter() {
		b.addActionListener(
				
				new ActionListener(){
					int i=0;
					public void actionPerformed(ActionEvent e) {
						i++;
						l.setText(""+i);
					}
				}
				
				);
	}
	
	public static void main(String[] args) {
		ShowInFrame.show(new Counter());

	}

}
