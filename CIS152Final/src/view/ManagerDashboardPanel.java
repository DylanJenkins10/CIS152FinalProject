package view;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ManagerDashboardPanel extends JPanel {
	
	private JLabel companyTitle = new JLabel("Tommy Trucking Manufacturing");
	
	private JLabel Title = new JLabel("Manager Dashboard");
	
	private JLabel Spacing1 = new JLabel("                                                                                   "
			+ "                                                                                                             "
			+ "                                                                                                             ");
	
	private JLabel Spacing2 = new JLabel("                                                                                   "
			+ "                                                                                                             "
			+ "                                                                                                             ");
	
	private JLabel Spacing3 = new JLabel("                                                                                   "
			+ "                                                                                                             "
			+ "                                                                                                             ");
	
	JButton employeesWindowButton = new JButton("Employees");
	
	
	JButton priorityTasksWindowButton = new JButton("Priorty Tasks");
	
	public ManagerDashboardPanel() {
		super();
		
		add(companyTitle);
		
		add(Spacing1);
		
		add(Title);
		
		add(Spacing2);
		
		employeesWindowButtonListener employeeButtonListener = new employeesWindowButtonListener();
		employeesWindowButton.addActionListener(employeeButtonListener);
		
		add(employeesWindowButton);
		
		add(Spacing3);
		
		priorityTasksWindowButtonListener priorityButtonListener = new priorityTasksWindowButtonListener();
		priorityTasksWindowButton.addActionListener(priorityButtonListener);
		
		add(priorityTasksWindowButton);
	}
	
	class priorityTasksWindowButtonListener implements ActionListener {
        
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame frame = new JFrame("Queue Panel");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 300);
	        
	        QueuePanel queuePanel = new QueuePanel();
	        frame.add(queuePanel);
	        
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
		}
		
	}
	
	class employeesWindowButtonListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			 JFrame frame = new JFrame("Employees Panel");
		     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     frame.setSize(400, 300);

		     EmployeesPanel panel = new EmployeesPanel(frame);
		     frame.add(panel);

		     frame.setLocationRelativeTo(null);
		     frame.setVisible(true);
		}
	}
}
