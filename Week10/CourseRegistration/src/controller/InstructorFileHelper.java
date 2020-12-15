package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.Instructor;

public class InstructorFileHelper implements FileHelper {
	String nameOfFile	= "instructors.txt";
	File instructorList	= new File(nameOfFile);

	@Override
	public boolean doesAFileExist() {
		if(instructorList.exists())	{
			return	true;
		} else {
			return	false;
		}
	}

	@Override
	public ArrayList<?> readFile() {
		ArrayList<Instructor> allInstructors = new ArrayList<Instructor>();
		Scanner	fileIn;
		try	{
			fileIn	=	new	Scanner(instructorList);
			while (fileIn.hasNextLine()){
				String value = fileIn.nextLine();
				String[] parts = value.split(",");
				Instructor currentInstructor =	new	Instructor(parts[0], parts[1],	
				parts[2]);
				allInstructors.add(currentInstructor);
			}
			fileIn.close();
		} catch	(FileNotFoundException	e)	{
//			TODO	Auto-generated	catch	block
		}
		return	allInstructors;
	}

	@Override
	public boolean writeFile(ArrayList<?> list) {
		ArrayList<Instructor> instructorsToWrite = (ArrayList<Instructor>)(list);
		try	{
			PrintWriter	instructorFile = new PrintWriter(nameOfFile);
			for(Instructor c: instructorsToWrite){
			StringBuilder sb = new StringBuilder();
			sb.append(c.getFirstName() +	","	+c.getLastName() + "," + 
			c.getEmail());
			instructorFile.println(sb.toString());
		}
			
		instructorFile.close();
		} catch	(FileNotFoundException	e)	{
			return	false;
		}
		
		return	true;
	}
	
}
