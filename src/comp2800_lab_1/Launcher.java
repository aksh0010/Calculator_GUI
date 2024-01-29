package comp2800_lab_1;

import java.awt.EventQueue;

public class Launcher {

	public static void main(String[] args) {
		// Run this program on the Event Dispatch Thread (EDT)
		EventQueue.invokeLater(new Runnable() {
			//creating instance of mainframe and using show method to set frame to visible
			public void run() {	
				MainFrame frame = new MainFrame();
				frame.show();
			}
		});
	}
}