package map;

import java.io.Serializable;
import java.util.Map;

public class PersonDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 198795783376978858L;

	private int id;
	private String firstname;
	private String middlename;
	private String lastname;
	private int age;
	
	private Map<String, course>courses;
	
	public PersonDetail() {
		
	}
	
	public PersonDetail(int id, String firstname, String middlename,
			String lastname, int age,  Map<String, course>courses) {
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.age = age;
		this.courses = courses;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Map<String, course> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, course> courses) {
		this.courses = courses;
	}
	
}
