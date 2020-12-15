package model;

import java.time.LocalTime;

public class Course {
	private String CRN;
	private String courseName;
	private LocalTime startTime;
	private LocalTime endTime;
	private Instructor teacher;
	private Classroom location;
	
	public Course() {
		
	}

	public Course(String cRN, String courseName, LocalTime startTime, LocalTime endTime, Instructor teacher,
			Classroom location) {
		super();
		CRN = cRN;
		this.courseName = courseName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.teacher = teacher;
		this.location = location;
	}

	public String getCRN() {
		return CRN;
	}

	public void setCRN(String cRN) {
		CRN = cRN;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public Instructor getTeacher() {
		return teacher;
	}

	public void setTeacher(Instructor teacher) {
		this.teacher = teacher;
	}

	public Classroom getLocation() {
		return location;
	}

	public void setLocation(Classroom location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Course [CRN=" + CRN + ", courseName=" + courseName + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", teacher=" + teacher + ", location=" + location + "]";
	}
	
	
	
	

}
