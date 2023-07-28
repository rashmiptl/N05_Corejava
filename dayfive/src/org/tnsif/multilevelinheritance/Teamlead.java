package org.tnsif.multilevelinheritance;


//child class2
//parent class2
public class Teamlead extends Manager{
	
	private String leadName;
	private int empID;
	private String projectName;
	
	//getters and setters
	public String getLeadName() {
		return leadName;
	}
	public void setLeadName(String leadName) {
		this.leadName = leadName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "Teamlead [leadName=" + leadName + ", empID=" + empID + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}
	
	public Teamlead(String deptName, String name, int empid,String leadName,String projectName) {
		super(deptName, name, empid);
		// TODO Auto-generated constructor stub
	}
	
	}
	
	
	

