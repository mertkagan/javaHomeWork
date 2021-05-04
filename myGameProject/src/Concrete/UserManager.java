package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	public UserManager(UserCheckService userCheckService) {
		this.userCheckService=userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.loginControl(user)) {
			System.out.println(user.getFirstName() + user.getLastName() + " Baþarýyla Eklendi");
		}else {
			System.out.println(user.getFirstName() + user.getLastName() 
			+ " Ýsimli Kullanýcýnýn Bilgileri Eksik veya geçersiz");
		}
		
	}

	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"Baþarýyla Silindi");
		
	}

	@Override
	public void uptade(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"Baþarýyla Güncellendi");
		
	}

}
