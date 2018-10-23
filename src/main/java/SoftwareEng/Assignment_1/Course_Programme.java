package SoftwareEng.Assignment_1;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course_Programme {

	public String CName;
	public ArrayList<Module> listOfModules;
	public ArrayList<Student> listOfStudents;
	public DateTime startDate;
	public DateTime endDate;
	

	public Course_Programme(String name, DateTime academicStartDate, DateTime academicEndDate) {
		
		this.CName = name;
		listOfModules = new ArrayList<Module>();
	    listOfStudents = new ArrayList<Student>();
	    this.startDate = academicStartDate;
	    this.endDate = academicEndDate;
	    
	}

	public void addStudent_Course(Student student){
		if(!listOfStudents.contains(student)){
			listOfStudents.add(student);
		}
	}
	
	public void addModule_Course(Module module){
		if(!listOfModules.contains(module)){
			listOfModules.add(module);
		}
	}
	

}
