package homeWork3;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Mert Ka�an");
		student1.setLastName("AKTA�");
		student1.seteMail("student1@gmail.com");
		student1.setPassword("123456");
		student1.setStudentNumber("std1");
		student1.setCourse("JAVA&REACT");
		
		Instructor instrucor1 = new Instructor();
		instrucor1.setId(2);
		instrucor1.setFirstName("Engin");
		instrucor1.setLastName("Demiro�");
		instrucor1.seteMail("�nstructor@gmail.com");
		instrucor1.setPassword("123456");
		instrucor1.setAbout("MCT,PMP SERT�F�KALARINA SAH�B�M");
		instrucor1.setCourse("JAVA&REACT");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student1);
		studentManager.logout(student1);
		studentManager.register(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instrucor1);
		instructorManager.logout(instrucor1);
	
		
		
		
		
		
		
		

	}

}
