package com.coderscampus.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class OutputFileService {
	public void generateFile(Courses[] course1Record, File csvfile) {
		//handling null rows 
		Courses courseNullValue = new Courses();
		for(int i=0; i < course1Record.length; i++) {
		 	if(course1Record[i]==null) {
		 		courseNullValue.setStudentID(0);
		 		courseNullValue.setStudentName("");
		 		courseNullValue.setStudentGrade(0);
		 		courseNullValue.setCourseName("");
				course1Record[i] = courseNullValue;
		 	}else{
		 		continue;
		 	}
		}
		Arrays.sort(course1Record);
		PrintWriter out = null;	
		try{
			out = new PrintWriter(csvfile);
			out.printf("Student ID, Student Name, Course, Grade\n");
			for (Courses course : course1Record) {
				if(course.getStudentID()==0) {
					 continue;
					}else {
						out.printf("%d, %s,%s,%d\n", course.getStudentID(),course.getStudentName(),course.getCourseName(),course.getStudentGrade());
					 
				}
			}
		}catch (FileNotFoundException e) {
		e.printStackTrace();
		}finally {
			if(out != null) {
			out.close();
			}
		}
	}
}


