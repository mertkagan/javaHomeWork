package homeWork3;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + "Ba�ar�yla giri� yapt�.");
		
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + "Ba�ar�yla ��k�� yapt�");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName()+"Ba�ar�yla Kay�t oldu");
	}

}
