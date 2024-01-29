package comp2800_lab_1;

//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.GridLayout;
//import java.awt.Insets;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

public class MainFrame  {

	private JFrame frame;
	private JPanel main_panel;
	private JPanel panel_for_output;
	private JPanel panel_for_inputs;
	private JButton button;
	private JTextField display;
	
	public MainFrame() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(600, 250);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout(10, 10));
		

		
		// Creating One big panel and adding two panels vertically using border layout
		
		main_panel=new JPanel(new BorderLayout());
		
		//Creating input panel for operations using grid layout for 5 row and 7 cols
		panel_for_inputs = new JPanel(new GridLayout(5,7,5,5));	
		panel_for_inputs.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		
		//creating output panel so that we can add JtextFiled into it
		panel_for_output = new JPanel(new BorderLayout());
		panel_for_output.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		//creating display and setting its editable state to false
		display = new JTextField(50);
		display.setPreferredSize(new Dimension(30,30));
		display.setEditable(false);
		display.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
		
		//adding display to panel
		panel_for_output.add(display);
		
		
		String[] buttons = {
	            "Rad", "Deg", "x!", "(", ")", "%", "AC",
	            "Inv", "sin", "ln", "7", "8", "9", "/",
	            "PI", "cos", "log", "4", "5", "6", "x",
	            "E", "tan", "root", "1", "2", "3", "-",
	            "Ans", "EXP", "Pow", "0", ".", "=", "+"
	        };
		/*looping over all buttons and adding them in panel which
			was initilialy set to grid layout
			
			Also we are adding same Action listener to all buttons.
			
		
		*/
		for ( int i =0;i<buttons.length;i++) {
			
			
			button= new JButton(buttons[i]);
			button.setMargin(new Insets(10, 10, 10, 10));
			button.setFocusable(false);
			
			button.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					display.setText("Error");
				}
			});
			panel_for_inputs.add(button);
		}
		
		// adding both display panel and input panel to main panel
	
		main_panel.add(panel_for_output,BorderLayout.NORTH);
		main_panel.add(panel_for_inputs,BorderLayout.CENTER);
		
		
		// adding main panel to frame 
		frame.add(main_panel);
	
	}
	
	// show method just sets the visibility of frame to be true
	public void show() {
		this.frame.setVisible(true);
	}
}