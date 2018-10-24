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
	
	public void addStudent_Module(Student student){
		if(!listOfStudents.contains(student)){
			listOfStudents.add(student);
		}
	}
	public void addCourse_Module(Course_Programme courses){
		if(!associatedCourses.contains(courses)){
			associatedCourses.add(courses);
		}
	}
	public ArrayList<Student> getListOfStudents(){
		return listOfStudents;
		
	}
	public ArrayList<Course_Programme> getAssociatedCourses(){
		return associatedCourses;
		
	}
}
