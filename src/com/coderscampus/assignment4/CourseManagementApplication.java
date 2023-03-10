package com.coderscampus.assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;



public class CourseManagementApplication{

	public static void main(String[] args) {
		
		  Courses[] course1Record = new Courses[101];
		  Courses[] course2Record = new Courses[101];
		  Courses[] course3Record = new Courses[101];
		  
		  //Reading data from CVS file
		  InputFileService inputService = new InputFileService();
		  inputService.readFile(course1Record, course2Record, course3Record);
		  
		  //Writing data on CVS files, course1.csv, course2.csv, course3.csv
		  OutputFileService outputService = new OutputFileService();
		  File csvfile1 = new File("course1.csv");
		  outputService.generateFile(course1Record, csvfile1);
		  File csvfile2 = new File("course2.csv");
		  outputService.generateFile(course2Record, csvfile2);
		  File csvfile3 = new File("course3.csv");
		  outputService.generateFile(course3Record, csvfile3);
	}



}

