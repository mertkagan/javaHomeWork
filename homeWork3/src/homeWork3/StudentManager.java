package homeWork3;

public class StudentManager extends UserManager {

	public void login(User user) {
		System.out.println(user.getFirstName() + " ��renci Ba�ar�yla Giri� Yapt�");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + "��renci Ba�ar�yla ��k�� Yapt�");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " ��renci Ba�ar�yla Kay�t Oldu");
	}
	
	 
	
}
