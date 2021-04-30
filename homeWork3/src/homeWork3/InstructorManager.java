package homeWork3;

public class InstructorManager extends UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " Eðitmen Baþarýyla Giriþ Yaptý");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + "Eðitmen Baþarýyla Çýkýþ Yaptý");
	}

}
