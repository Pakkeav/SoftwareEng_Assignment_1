package SoftwareEng.Assignment_1;

import java.util.ArrayList;

public class Module {

	public String moduleCode;
	public String name;
	public ArrayList<Student> listOfStudents;
	public ArrayList<Course_Programme> associatedCourses;

	public Module(String code, String name){
		this.moduleCode = code;
		this.name = name;
		listOfStudents = new ArrayList<Student>();
		associatedCourses = new ArrayList<Course_Programme>();
	  }
	
	public void addModule_Student(Student student){
		if(!listOfStudents.contains(student)){
			listOfStudents.add(student);
		}
	}
	public ArrayList<Student> listOfStudents(){
		return listOfStudents;
		
	}
	public ArrayList<Course_Programme> associatedCourses(){
		return associatedCourses;
		
	}
}
