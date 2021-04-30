package homeWork3;

public class Instructor extends User {
	
	private String about;
	private String course;
	
	public Instructor() {}
	
	public Instructor(int id, String firstName, String lastName, String eMail, String password, String about,
			String course) {
		super(id, firstName, lastName, eMail, password);
		this.about = about;
		this.course = course;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	

	
	
	

}
