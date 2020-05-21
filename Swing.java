no2;

import javax.swing.*;
class Swing extends Jframe{
	Swing(){
		super("INI SWING LHO...");
		setSize(300,300);
		show();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	}
	public static void main(String[] args) {
		Swing sw=new Swing();
	} 
}
