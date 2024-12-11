package model;

import java.util.List;

import model.Employee;

public class Building {
	
	private String buildingName;
	private String location;
	private String manager;
	private List<Employee> employees;
	
	// constructors
	
	public Building() {
		super();
	}

	public Building(String buildingName, String location, String manager, List<Employee> employees) {
		super();
		this.buildingName = buildingName;
		this.location = location;
		this.manager = manager;
		this.employees = employees;
	}
	
	// getters and setters

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
	

}
