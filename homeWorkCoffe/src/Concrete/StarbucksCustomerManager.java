package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerService;
	
	public StarbucksCustomerManager(CustomerCheckService customerService) {
		this.customerService=customerService;
	}
	
	@Override
	public void save(Customer customer) {
		if (customerService.checkIfRealPerson(customer)) {
			super.save(customer);
		} else {
			throw new ArithmeticException("Not a valid person.");
		}
	}
	
	
	
	
	
	
	
	

}
