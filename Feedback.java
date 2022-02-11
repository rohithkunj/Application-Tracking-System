package net.javaguides.springboot.model;
    import javax.persistence.Column;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	@Entity
	@Table(name = "TechincalFeedback")

public class Feedback {


		
		@Id
		@GeneratedValue(strategy =  GenerationType.IDENTITY)
		private long id;
		
		
		@Column(name = "CandidateName")
		private String candidatename;
		
		@Column(name = "JobTitle")
		private String jobtitle;
		
		@Column(name = "Interviewer_Name")
		private String InterviewerName;
		
		@Column(name="PrimarySkillsRating")
		private String primaryskillsRating;
		@Column(name="Skillarea")
		private String skillarea;
		@Column(name="Notes")
		private String notes;
		@Column(name="OverallRating")
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
		public String getPrimaryskillsRating() {
			return primaryskillsRating;
		}
		public void setPrimaryskillsRating(String primaryskillsRating) {
			this.primaryskillsRating = primaryskillsRating;
		}
		public String getSkillarea() {
			return skillarea;
		}
		public void setSkillarea(String skillarea) {
			this.skillarea = skillarea;
		}
		public String getNotes() {
			return notes;
		}
		public void setNotes(String notes) {
			this.notes = notes;
		}
		public int getOverallRating() {
			return overallRating;
		}
		public void setOverallRating(int overallRating) {
			this.overallRating = overallRating;
		}
		public String getResult() {
			return Result;
		}
		public void setResult(String result) {
			Result = result;
		}
		
		
public Feedback(long id, String candidateName, String jobtitle, String interviewerName, String primaryskillsRating,
		String skillarea, String notes, int overallRating, String result) {
	super();
	this.id = id;
	candidatename = candidatename;
	this.jobtitle = jobtitle;
	this.InterviewerName = interviewerName;
	this.primaryskillsRating = primaryskillsRating;
	this.skillarea = skillarea;
	this.notes = notes;
	this.overallRating = overallRating;
	Result = result;
}
public Feedback() {
			
		}
		
	}


