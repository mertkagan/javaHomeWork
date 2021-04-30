package homeWork3;

public class UserManager {
	
	public void login(User user) {
		System.out.println(user.getFirstName() + "Baþarýyla giriþ yaptý.");
		
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + "Baþarýyla çýkýþ yaptý");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName()+"Baþarýyla Kayýt oldu");
	}

}
