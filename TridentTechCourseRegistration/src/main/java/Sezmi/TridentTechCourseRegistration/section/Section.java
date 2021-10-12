package Sezmi.TridentTechCourseRegistration.section;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "section")
public class Section 
{
	//declare variables for column in the table
	private String section_id;
	private String instructor_id;
	private String schedule;
	private String term;
	private String duration;
	private String time;
	private String course_format;
	private String remaining_spaces;
	private String course_id;
	
	public Section()
	{}

	public Section(String section_id, String instructor_id, String schedule, String term, String duration, String time,
			String course_format, String remaining_spaces, String courseID) 
	{
		this.section_id = section_id;
		this.instructor_id = instructor_id;
		this.schedule = schedule;
		this.term = term;
		this.duration = duration;
		this.time = time;
		this.course_format = course_format;
		this.remaining_spaces = remaining_spaces;
		this.course_id = course_id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "section_id", nullable = false, updatable = false)
	public String getSectionID()
	{
		return section_id;
	}

	@Column(name = "instructor_id")
	public String getInstructorID() {
		return instructor_id;
	}

	public void setInstructorID(String instructorID) {
		this.instructor_id = instructorID;
	}

	@Column(name = "schedule")
	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	@Column(name = "term")
	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	@Column(name = "duration")
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Column(name = "time")
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Column(name = "course_format")
	public String getCourseFormat() {
		return course_format;
	}

	public void setCourseFormat(String courseFormat) {
		this.course_format = courseFormat;
	}

	@Column(name = "remaining_spaces")
	public String getRemainingSpace() {
		return remaining_spaces;
	}

	public void setRemainingSpace(String remainingSpace) {
		this.remaining_spaces = remainingSpace;
	}

	@Column(name = "course_id")
	public String getCourseID() {
		return course_id;
	}

	public void setCourseID(String courseID) {
		this.course_id = courseID;
	}

	public void setSectionID(String sectionID) {
		this.section_id = sectionID;
	}
	
	
	
	
	
	
	
	

}
