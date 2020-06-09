package entity_onetomany;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class course implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7937470549893759048L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "course", unique = true, nullable = false, length = 100)
	private String course;
	
	@ManyToOne
	private PersonDetail persons;
	
	public course() {}
	
	public course(int id, String course,PersonDetail persons) {
		this.id= id;
		this.course = course;
		this.persons = persons;
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

	public PersonDetail getPersons() {
		return persons;
	}

	public void setPersons(PersonDetail persons) {
		this.persons = persons;
	}
	
}
