import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManagerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManagerNero = new NeroCustomerManager(new CustomerCheckManager());
		
		
		Customer customerStarbucks = new Customer();
		customerStarbucks.setId(1);;
		customerStarbucks.setFirstName("Mert Kaðan");
		customerStarbucks.setLastName("Aktaþ");
		customerStarbucks.setNationalityId("12345678912");
		customerStarbucks.setDateOfBirth(LocalDate.of(2000, 07, 19));
		
		customerManagerStarbucks.save(customerStarbucks);
		
		Customer customerNero = new Customer();
		customerNero.setId(1);
		customerNero.setFirstName("Ali");
		customerNero.setLastName("Can");
		customerNero.setNationalityId("12345678911");
		customerNero.setDateOfBirth(LocalDate.of(1991,10,11));
		customerManagerNero.save(customerNero);
		

	}

}
