package net.javaguides.springboot.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name = "scheduleinterviews")

public class ScheduleInterview {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	
	
	String employeename;
	String jobtitle;
	String interviewtype;
	String emailid;
	String stages;
	String interviewdate;
	String interviewtime;
	String interviewduration;
	String note;
	
	/**
	 * @param employeename
	 * @param jobtitle
	 * @param interviewtype
	 * @param emailid
	 * @param stages
	 * @param interviewdate
	 * @param interviewtime
	 * @param interviewduration
	 * @param note
	 */

	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getInterviewtype() {
		return interviewtype;
	}
	public void setInterviewtype(String interviewtype) {
		this.interviewtype = interviewtype;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getStages() {
		return stages;
	}
	public void setStages(String stages) {
		this.stages = stages;
	}
	public String getInterviewdate() {
		return interviewdate;
	}
	public void setInterviewdate(String interviewdate) {
		this.interviewdate = interviewdate;
	}
	public String getInterviewtime() {
		return interviewtime;
	}
	public void setInterviewtime(String interviewtime) {
		this.interviewtime = interviewtime;
	}
	public String getInterviewduration() {
		return interviewduration;
	}
	public void setInterviewduration(String interviewduration) {
		this.interviewduration = interviewduration;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public ScheduleInterview(String employeename, String jobtitle, String interviewtype, String emailid, String stages,
			String interviewdate, String interviewtime, String interviewduration, String note) {
		super();
		this.employeename = employeename;
		this.jobtitle = jobtitle;
		this.interviewtype = interviewtype;
		this.emailid = emailid;
		this.stages = stages;
		this.interviewdate = interviewdate;
		this.interviewtime = interviewtime;
		this.interviewduration = interviewduration;
		this.note = note;
	}
	/**
	 * 
	 */
	public ScheduleInterview() {
		
		// TODO Auto-generated constructor stub
	}
	
}


	