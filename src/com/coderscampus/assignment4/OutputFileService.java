package com.coderscampus.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class OutputFileService {
	public void generateFile(Courses[] course1Record, File csvfile) {
		//handling null rows 
		for(int i=0; i < course1Record.length; i++) {
		 	if(course1Record[i]==null) {
				Courses course = new Courses();
				course.setStudentID(0);
				course.setStudentName("");
				course.setStudentGrade(0);
				course.setCourseName("");
				course1Record[i]=course;
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


