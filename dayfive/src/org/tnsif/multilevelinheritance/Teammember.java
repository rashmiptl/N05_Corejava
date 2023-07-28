package org.tnsif.multilevelinheritance;

//child class1
public class Teammember extends Teamlead {
	
	private int size;
	private int duration;
	
	//parameterized constructor
	
	public Teammember(String deptName, String name, int empid, String leadName, String projectName) {
		super(deptName, name, empid, leadName, projectName);
		
	}

	public int getsize()
	{
		return size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Teammember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

	}


