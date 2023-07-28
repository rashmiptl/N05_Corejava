package org.tnsif.hierarchicalinheritance;
//child class 2
public class SnowCone {
	
  public int getVersion;
	public int version;
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public SnowCone(String string, int i) {
		super();
	
	}
	public SnowCone(int getVersion, int version) {
		super();
		this.getVersion = getVersion;
		this.version = version;
	}
	@Override
	public String toString() {
		return "SnowCone [getVersion=" + getVersion + ", version=" + version + ", toString()=" + super.toString() + "]";
	}
	
}
