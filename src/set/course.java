package set;

import java.io.Serializable;

public class course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7937470549893759048L;

	private int id;
	private String course;
	
	public course() {}
	
	public course(int id, String course) {
		this.id= id;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
}
