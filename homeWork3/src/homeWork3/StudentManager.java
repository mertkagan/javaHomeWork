package homeWork3;

public class StudentManager extends UserManager {

	public void login(User user) {
		System.out.println(user.getFirstName() + " Öðrenci Baþarýyla Giriþ Yaptý");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + "Öðrenci Baþarýyla Çýkýþ Yaptý");
	}
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " Öðrenci Baþarýyla Kayýt Oldu");
	}
	
	 
	
}
