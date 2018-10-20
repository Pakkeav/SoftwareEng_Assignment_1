package SoftwareEng.Assignment_1;

import java.util.ArrayList;

public class Module {

	private String moduleCode;
	private String name;
	ArrayList<Student> listOfStudents;
	private ArrayList<Course_Programme> associatedCourses;

	public Module(String code, String name){
		this.moduleCode = code;
		this.name = name;
		listOfStudents = new ArrayList<Student>();
		associatedCourses = new ArrayList<Course_Programme>();
	  }
	
	protected void addModule_Student(Student student){
		if(!listOfStudents.contains(student)){
			listOfStudents.add(student);
		}
	}
}
