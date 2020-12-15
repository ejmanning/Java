package test;
import java.time.LocalTime;

import model.Classroom;
import model.Course;
import model.Instructor;

public class ClassroomTesterManning {

	public static void main(String[] args) {
		Classroom compSciLab = new Classroom("8", "17", "Ankeny", "Computer Lab", 25);
		System.out.println(compSciLab.toString());
		
		Classroom bioLab = new Classroom("3", "28a", "Ankeny", "Science Lab", 22);
		System.out.println(bioLab.toString());
		
		Classroom litRoom = new Classroom("2", "12", "Urban", "Classroom", 18);
		System.out.println(litRoom.toString());
		
		Instructor wsmith = new Instructor("Wanda", "Smith");
		Instructor wfitz = new Instructor("Wilma", "Fitz");
		Instructor etheo = new Instructor("Emily", "Theo");
		
		Course bio101 = new Course("24680", "BIO101", LocalTime.of(11,  15), LocalTime.of(12, 55), wsmith, bioLab);
		System.out.println(bio101.toString());
		
		Course cis171 = new Course("23456", "CIS171", LocalTime.of(10, 10), LocalTime.of(12,20), wfitz, compSciLab);
		System.out.println(cis171.toString());
		
		Course lit105 = new Course("29876", "LIT105", LocalTime.of(15, 15), LocalTime.of(16, 30), etheo, litRoom);
		System.out.println(lit105.toString());
		
		
		
	}

}
