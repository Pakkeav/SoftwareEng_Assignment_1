package SoftwareEng.Assignment_1;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Student {
	
	// declaring student property
	public String name;
	public int age;
	public DateTime DOB;
	public int ID;
	public String username;
	public String User;
	public ArrayList<Module> listOfModules;
	public String course;

	// initializing student property in constructor
	public Student(String SName, int age, DateTime DOB, int ID, String course) {
		//this.name = SName;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
		this.course = course;
		listOfModules = new ArrayList<Module>();
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		this.User = name + age;
		if(User.contains(" ")) {
			username = User.replace(" ", "");
		}else {
			return User;
		}
		return username;
	}
	
	public void addModule_Student(Module module){
		if(!listOfModules.contains(module)){
			listOfModules.add(module);
		}
	}

	
}