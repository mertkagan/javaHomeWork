package homeWork3;

public class InstructorManager extends UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + " E�itmen Ba�ar�yla Giri� Yapt�");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + "E�itmen Ba�ar�yla ��k�� Yapt�");
	}

}
