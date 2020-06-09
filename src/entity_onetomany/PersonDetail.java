package entity_onetomany;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personDetail")
public class PersonDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 198795783376978858L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "firstname", nullable = false, length = 100)
	private String firstname;
	
	@Column(name = "middlename", nullable = false, length = 100)
	private String middlename;
	
	@Column(name = "lastname", nullable = false, length = 100)
	private String lastname;
	
	@Column(name = "age", nullable = false, length = 100)
	private int age;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="persons_id")
	
	private Set<course> courses = new HashSet<>();
	
	public PersonDetail() {
		
	}
	
	public PersonDetail(int id, String firstname, String middlename,
			String lastname, int age,  Set<course> courses) {
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

	public Set<course> getCourses() {
		return courses;
	}

	public void setCourses(Set<course> courses) {
		this.courses = courses;
	}
	
}
