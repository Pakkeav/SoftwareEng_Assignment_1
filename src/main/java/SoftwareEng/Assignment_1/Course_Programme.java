package SoftwareEng.Assignment_1;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Course_Programme {

	public String CName;
	public List<Module> listOfModules;
	public List<Student> listOfStudents;
	public DateTime startDate;
	public DateTime endDate;
	

	public Course_Programme(String name, DateTime academicStartDate, DateTime academicEndDate) {
		
		this.CName = name;
		this.listOfModules = new ArrayList<Module>();
	    this.listOfStudents = new ArrayList<Student>();
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
	
	public List<Module> getModules() {
        return listOfModules;
    }
}
