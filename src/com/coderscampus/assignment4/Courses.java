package com.coderscampus.assignment4;

import java.io.Serializable;

public class Courses implements Serializable, Comparable<Courses>  {
	private static final long serialVersionUID = 1L;
	private Integer studentID;
	private  String studentName;
	private  String courseName;
	private  Integer studentGrade;
	
	public Courses() {
	}
	public Courses(Integer _studentID,String _studentName,String _courseName, Integer _studentGrade ) {
		this.setStudentID(_studentID);
		this.setStudentName(_studentName);
		this.setCourseName(_courseName);
		this.setStudentGrade(_studentGrade);	
	}
	public Courses(Courses source) {
		this.setStudentID(source.studentID);
		this.setStudentName(source.studentName);
		this.setCourseName(source.courseName);
		this.setStudentGrade(source.studentGrade);	
	}
	@Override
	public String toString() {
		return "Courses [studentID=" + studentID + ", studentName=" + studentName + ", couseName=" + courseName
				+ ", studentGrade=" + studentGrade + "]";
	}
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(Integer studentGrade) {
		this.studentGrade = studentGrade;
	}
// I tried to use .equals() method but it is giving me error
//	@Override
//	public int compareTo(Courses that) {
//		int result=0;
//		if(this.getStudentGrade()>that.getStudentGrade()) {
//			result= -1;				
//		}else if(this.getStudentGrade()==(that.getStudentGrade())) {
//			result = 0;
//		}else if(this.getStudentGrade() < that.getStudentGrade()) {
//			result =  1;
//		}
//		return result;
//	}
	@Override
	public int compareTo(Courses that) {
		if(this.studentGrade.compareTo(that.studentGrade)==0) {
			return that.studentGrade.compareTo(this.studentGrade);				
		}else 
			return that.studentGrade.compareTo(this.studentGrade);	
	}
			
}
