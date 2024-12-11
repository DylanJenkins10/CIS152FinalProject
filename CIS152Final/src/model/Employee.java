package model;

public class Employee {
	
	private int ID;
	private String Name;
	private String jobTitle;
	
	// constructors
	
	public Employee() {
		super();
	}
	
	public Employee(int ID, String Name, String jobTitle) {
		super();
		this.ID = ID;
		this.Name = Name;
		this.jobTitle = jobTitle;
	}
	
	// getters and setters

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	

}
