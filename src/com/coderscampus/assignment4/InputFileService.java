package com.coderscampus.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class InputFileService {
	
	public void readFile(List<Courses> course1Record, List<Courses> course2Record, List<Courses> course3Record) {
		String line;
		
		BufferedReader fileReader=null;
		try{
				fileReader = new BufferedReader(new FileReader("student-master-list.csv"));
				fileReader.readLine();
				while ((line = fileReader.readLine()) != null) {
					String[] dataInEachField = line.split(",");
					if( (dataInEachField[2].matches("^COMPSCI+ [0-9]+")) ){
		        	 	Courses course1Entry = new Courses(Integer.parseInt(dataInEachField[0]), dataInEachField[1],dataInEachField[2],Integer.parseInt(dataInEachField[3]));
		        	 	course1Record.add(course1Entry);
					}else if(( (dataInEachField[2].matches("^APMTH+ [0-9]+")) )){
		        	 	Courses course2Entry = new Courses(Integer.parseInt(dataInEachField[0]), dataInEachField[1],dataInEachField[2],Integer.parseInt(dataInEachField[3]));
		        		course2Record.add(course2Entry);
					}else if(( (dataInEachField[2].matches("^STAT+ [0-9]+")) )){
		        	 	Courses course3Entry = new Courses(Integer.parseInt(dataInEachField[0]), dataInEachField[1],dataInEachField[2],Integer.parseInt(dataInEachField[3]));
		        		course3Record.add(course3Entry);
					}
				}
		}catch (IOException e) {
		      e.printStackTrace();
		}finally {
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
