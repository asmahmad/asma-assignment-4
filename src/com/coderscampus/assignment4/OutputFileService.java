package com.coderscampus.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class OutputFileService {
	public void generateFile(List<Courses> courseRecord, File csvfile) {
		Courses[] courseArray = new  Courses[courseRecord.size()];
		  	for(int j=0; j < courseRecord.size(); j++) {
		  		courseArray[j] = courseRecord.get(j);
		  	}	  
		Arrays.sort(courseArray);
		PrintWriter out=null;
		try{
			out = new PrintWriter(csvfile);
			out.printf("Student ID, Student Name, Course, Grade\n");
			 for (Courses course : courseArray) {
				 out.printf("%d, %s,%s,%d\n", course.getStudentID(),course.getStudentName(),course.getCourseName(),course.getStudentGrade());
				 
			 }
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out != null) {
				out.close();
			}
		}
	}
}
