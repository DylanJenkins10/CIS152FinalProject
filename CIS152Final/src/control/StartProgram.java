package control;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import view.ManagerDashboardPanel;


public class StartProgram {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new ManagerDashboardPanel();
		
		frame.add(panel);
		
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}

}
