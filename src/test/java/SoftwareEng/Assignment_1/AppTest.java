package SoftwareEng.Assignment_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.joda.time.DateTime;
import org.junit.Test;
 
public class AppTest {
	
	@Test
	public void studentTest(){
		
		Student s1 = new Student("John  Ham", 22, new DateTime(), 12345678, "I.T");
		
		Module m1 = new Module("CT123", "Programming");
		Module m2 = new Module("CT321", "Computer Science");
		Module m3 = new Module("CT555", "Maths");
		
		//Test username generation
	    String s1Username = s1.getUsername();
	    assertEquals("JohnHam20", s1Username);
	    
	    //Test add module to student
	    s1.addModule_Student(m1);
	    s1.addModule_Student(m2);
	    s1.addModule_Student(m3);
	    assertTrue(s1.listOfModules.contains(m2));
	}

	@Test
	public void ModuleTest(){
		
		Module m1 = new Module("CT123", "Programming");
		Student s1 = new Student("John", 20, new DateTime(), 12345678, "I.T");
		
		m1.addModule_Student(s1);
		assertTrue(m1.listOfStudents.contains(s1));

	}
	
	@Test
	public void courseTest(){
		
		Module m1 = new Module("CT123", "Programming");
		Module m2 = new Module("CT321", "Computer Science");
		Module m3 = new Module("CT555", "Maths");
		
		Course_Programme C1 = new Course_Programme("I.T", new DateTime(), new DateTime());
		Student s1 = new Student("John  Ham", 22, new DateTime(), 12345678, "I.T");
		
		//add student to course enrollment and test
		C1.addStudent_Course(s1);
	    assertTrue(C1.listOfStudents.contains(s1));
		
	    //add module to course and test
		C1.addModule_Course(m1);
		C1.addModule_Course(m2);
		C1.addModule_Course(m3);
	    assertTrue(C1.listOfModules.contains(m1));
	}
	
}
