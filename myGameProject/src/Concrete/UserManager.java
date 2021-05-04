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
			System.out.println(user.getFirstName() + user.getLastName() + " Ba�ar�yla Eklendi");
		}else {
			System.out.println(user.getFirstName() + user.getLastName() 
			+ " �simli Kullan�c�n�n Bilgileri Eksik veya ge�ersiz");
		}
		
	}

	@Override
	public void remove(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"Ba�ar�yla Silindi");
		
	}

	@Override
	public void uptade(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+"Ba�ar�yla G�ncellendi");
		
	}

}
