package day5Hw1;

import day5Hw1.RegisterViaGoogle.RegisterViaGoogleManager;
import day5Hw1.business.concretes.CustomerManager;
import day5Hw1.core.ValidateManager;
import day5Hw1.core.ValidateService;
import day5Hw1.core.RegisterService;
import day5Hw1.core.RegisterViaGoogleAdapter;
import day5Hw1.dataAccess.abstracts.CustomerDao;
import day5Hw1.dataAccess.concretes.HibernateCustomerDao;
import day5Hw1.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerDao customerDao = new HibernateCustomerDao();
		ValidateService validateService = new ValidateManager(); 
		RegisterService registerService=new RegisterViaGoogleAdapter();
		CustomerManager customerManager = new CustomerManager(customerDao, validateService, registerService);
		
		Customer customer1 =new Customer(1, "Semih", "Gençten", "semihgencten@gmail.com", "123456");
		customerManager.add(customer1);
		
		customerManager.delete(customer1);
		customerManager.update(customer1);
		
		
		customerManager.addWithAdapter();
		
		customerManager.signIn("semihgencten@gmail.com", "123456");
		
	}

}
