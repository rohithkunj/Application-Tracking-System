package net.javaguides.springboot.model;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "overallFeedback")

public class OverallFeedback {

 

@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "Candidatename")
	private String candidateName;
	
	@Column(name = "JobTitle")
	private String jobtitle;
	@Column(name="Rounds")
	private String rounds;
	@Column(name="Comments")
	private String comments;
	@Column(name="Rating")
	private int rating;
	@Column(name="Result")
	private String result;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCandidateName() {
		return candidateName;
	}
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getRounds() {
		return rounds;
	}
	public void setRounds(String rounds) {
		this.rounds = rounds;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public OverallFeedback(long id, String candidateName, String jobtitle, String rounds, String comments, int rating,
			String result) {
		super();
		this.id = id;
		this.candidateName = candidateName;
		this.jobtitle = jobtitle;
		this.rounds = rounds;
		this.comments = comments;
		this.rating = rating;
		this.result = result;
	}
	
	public OverallFeedback()
	{
		
	}
}


