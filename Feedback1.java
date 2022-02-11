


package net.javaguides.springboot.model;



import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity

@Table(name = "HRFeedback")

public class Feedback1 {

@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name = "CandidateName")
	private String candidatename;
	
	@Column(name = "JobTitle")
	private String jobtitle;
	
	@Column(name = "InterviewerName")
	private String InterviewerName;
	
	@Column(name="EvaluationareaRating")
	private String evaluationareaRating;
	@Column(name="skillArea")
	private String skillarea;
	@Column(name="overallRating")
	private int overallRating;
	@Column(name="Result")
	private String Result;
	
	
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCandidateName() {
		return candidatename;
	}

	public void setCandidateName(String candidatename) {
		candidatename = candidatename;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getInterviewerName() {
		return InterviewerName;
	}

	public void setInterviewerName(String interviewerName) {
		InterviewerName = interviewerName;
	}

	public String getEvaluationareaRating() {
		return evaluationareaRating;
	}

	public void setEvaluationareaRating(String evaluationareaRating) {
		this.evaluationareaRating = evaluationareaRating;
	}

	public String getSkillarea() {
		return skillarea;
	}

	public void setSkillarea(String skillarea) {
		this.skillarea = skillarea;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		overallRating = overallRating;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	
public Feedback1(long id, String candidatename, String jobtitle, String interviewerName,
			String evaluationareaRating, String skillarea, int overallRating, String result) {
		super();
		this.id = id;
		candidatename = candidatename;
		this.jobtitle = jobtitle;
		InterviewerName = interviewerName;
		this.evaluationareaRating = evaluationareaRating;
		this.skillarea = skillarea;
		this.overallRating = overallRating;
		Result = result;
	}

public Feedback1() {
		
	}
	
}


