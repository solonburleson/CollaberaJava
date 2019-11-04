package cloneable;

public class SchoolType implements Cloneable {
	private String type;
	private String duration;
	
	public SchoolType() {
		
	}
	
	public SchoolType(SchoolType schooltype) {
		this.type = schooltype.getType();
		this.duration = schooltype.getDuration();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "SchoolType [type="+ type + ",duration=" + duration + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
