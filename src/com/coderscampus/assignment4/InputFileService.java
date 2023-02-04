package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.List;

public class InputFileService {
	
	public void readFile(Courses[] course1Record, Courses[] course2Record, Courses[] course3Record) {
		String line;
		
		BufferedReader fileReader=null;
		try{
				fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
				fileReader.readLine();
				int i=0;
				Courses course = null;
				
				while ((line = fileReader.readLine()) != null) {
					String[] dataInEachField = line.split(",");
					if( (dataInEachField[2].matches("^COMPSCI+ [0-9]+")) ){
						course = new Courses(Integer.parseInt(dataInEachField[0]), dataInEachField[1],dataInEachField[2],Integer.parseInt(dataInEachField[3]));
						course1Record[i] = course;
					}else if(( (dataInEachField[2].matches("^APMTH+ [0-9]+")) )){
						course = new Courses(Integer.parseInt(dataInEachField[0]), dataInEachField[1],dataInEachField[2],Integer.parseInt(dataInEachField[3]));
						course2Record[i] = course;
					}else if(( (dataInEachField[2].matches("^STAT+ [0-9]+")) )){
						course = new Courses(Integer.parseInt(dataInEachField[0]), dataInEachField[1],dataInEachField[2],Integer.parseInt(dataInEachField[3]));
						course3Record[i] = course;
					}
					i++;
				}
		}catch (IOException e) {
		      e.printStackTrace();
		}finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
