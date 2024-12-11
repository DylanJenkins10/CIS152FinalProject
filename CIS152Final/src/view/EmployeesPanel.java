package view;

import model.Employee;
import model.Building;

import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeesPanel extends JPanel {

    private JFrame parentFrame;  // To hold a reference to the JFrame

    // Constructor that accepts the parent frame
    public EmployeesPanel(JFrame frame) {
        parentFrame = frame;

        // Set layout for the panel
        setLayout(new GridLayout(6, 1)); // Increase grid size for the close button

        // North Building Employees
        Employee N1 = new Employee(321, "John Doe", "Engineer");
        Employee N2 = new Employee(468, "Jane Smith", "HR Specialist");
        Employee N3 = new Employee(542, "Emily Johnson", "Receptionist");
        Employee N4 = new Employee(853, "Micheal Brown", "IT Specialist");
        Employee N5 = new Employee(774, "David Anderson", "Office Manager");

        // South Building Employees
        Employee S1 = new Employee(604, "Sarah Davis", "Paint Manager");
        Employee S2 = new Employee(378, "James Wilson", "Painter");
        Employee S3 = new Employee(186, "Jessica Taylor", "Paint Prep");
        Employee S4 = new Employee(612, "Robert Martin", "Painter");
        Employee S5 = new Employee(753, "Linda Thomas", "Paint Prep");

        // East Building Employees
        Employee E1 = new Employee(924, "William White", "Assembly Manager");
        Employee E2 = new Employee(431, "Patricia Clark", "Assembly");
        Employee E3 = new Employee(345, "Joseph Lewis", "Assembly");
        Employee E4 = new Employee(893, "Lisa Walker", "Assembly");
        Employee E5 = new Employee(212, "Charles Young", "Assembly");

        // West Building Employees
        Employee W1 = new Employee(506, "Nancy King", "Welder");
        Employee W2 = new Employee(318, "Thomas Scott", "Welder");
        Employee W3 = new Employee(522, "Susan Adams", "Welder");
        Employee W4 = new Employee(789, "Richard Green", "Welder");
        Employee W5 = new Employee(204, "Karen Harris", "Weld Manager");

        // Create building employee lists
        List<Employee> building1Employees = new ArrayList<>();
        building1Employees.add(N1);
        building1Employees.add(N2);
        building1Employees.add(N3);
        building1Employees.add(N4);
        building1Employees.add(N5);

        List<Employee> building2Employees = new ArrayList<>();
        building2Employees.add(S1);
        building2Employees.add(S2);
        building2Employees.add(S3);
        building2Employees.add(S4);
        building2Employees.add(S5);

        List<Employee> building3Employees = new ArrayList<>();
        building3Employees.add(E1);
        building3Employees.add(E2);
        building3Employees.add(E3);
        building3Employees.add(E4);
        building3Employees.add(E5);

        List<Employee> building4Employees = new ArrayList<>();
        building4Employees.add(W1);
        building4Employees.add(W2);
        building4Employees.add(W3);
        building4Employees.add(W4);
        building4Employees.add(W5);

        // Create building objects
        Building building1 = new Building("Office Building", "North Building", "David Anderson", building1Employees);
        Building building2 = new Building("Paint Building", "South Building", "Sarah Davis", building2Employees);
        Building building3 = new Building("Assembly Building", "East Building", "William White", building3Employees);
        Building building4 = new Building("Weld Building", "West Building", "Karen Harris", building4Employees);

        // Create buttons for each building and add them to the panel
        JButton button1 = new JButton(building1.getBuildingName());
        JButton button2 = new JButton(building2.getBuildingName());
        JButton button3 = new JButton(building3.getBuildingName());
        JButton button4 = new JButton(building4.getBuildingName());

        // Add action listeners to the buttons to show building details and employees
        button1.addActionListener(e -> showBuildingDetails(building1));
        button2.addActionListener(e -> showBuildingDetails(building2));
        button3.addActionListener(e -> showBuildingDetails(building3));
        button4.addActionListener(e -> showBuildingDetails(building4));

        // Add buttons to the panel
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        // Add a close button to the panel
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> closeFrame());
        add(closeButton);
    }

    // Method to show building details and employee list in a dialog box
    private void showBuildingDetails(Building building) {
        StringBuilder details = new StringBuilder();
        details.append("Building Name: ").append(building.getBuildingName()).append("\n")
               .append("Building Location: ").append(building.getLocation()).append("\n")
               .append("Manager: ").append(building.getManager()).append("\n\n")
               .append("Employees:\n");

        // Add employee details to the string
        for (Employee employee : building.getEmployees()) {
            details.append(employee.getID()).append(" - ")
                   .append(employee.getName()).append(" - ")
                   .append(employee.getJobTitle()).append("\n");
        }

        // Show the details in a dialog box
        JOptionPane.showMessageDialog(this, details.toString(), "Building Information", JOptionPane.INFORMATION_MESSAGE);
    }

    // Method to close the frame without terminating the application
    private void closeFrame() {
        parentFrame.dispose();  // Closes the frame without terminating the application
    }
}

