package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	

	@Column(name = "candidatename")
	private String candidatename;
	
	@Column(name = "email")
	private String email;
	@Column(name="Experience")
	private String Experience;
	@Column(name="Phoneno")
	private long Phoneno;
	@Column(name="Title")
	private String Title;
	
	
	
	public void setId(long id) {
		this.id = id;
	}
	public String getCandidatename() {
		return candidatename;
	}
	public void setCandidatename(String candidatename) {
		this.candidatename = candidatename;
	}
	public long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return Experience;
	}
	public void setExperience(String experience) {
		this.Experience = experience;
	}
	public long getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.Phoneno = phoneno;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		this.Title = title;
	}

	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param candidatename
	 * @param email
	 * @param experience
	 * @param phoneno
	 * @param title
	 */
	public Employee(String candidatename, String email, String experience, long phoneno, String title) {
		super();
		this.candidatename = candidatename;
		this.email = email;
		Experience = experience;
		Phoneno = phoneno;
		Title = title;
	}
	
}
