package day5Hw1.business.concretes;
import java.util.regex.*;
import java.util.regex.Pattern;

import day5Hw1.business.abstracts.CustomerService;
import day5Hw1.core.RegisterService;
import day5Hw1.core.ValidateService;
import day5Hw1.dataAccess.abstracts.CustomerDao;
import day5Hw1.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	CustomerDao customerDao;
	ValidateService validateService;
	RegisterService registerService;
	
	public CustomerManager(CustomerDao customerDao, ValidateService validateService,RegisterService registerService) {
		super();
		this.customerDao = customerDao;
		this.validateService=validateService;
		this.registerService = registerService;
	}
	

	@Override
	public void add(Customer customer) {
		if(validateService.isValidInfo(customer) && validateService.isVerificatedEmail(customer)) {
			customerDao.add(customer);
		}else {
			System.out.println("Invalid user info!");
		}
		
		
		
		
	}

	

	@Override
	public void delete(Customer customer) {
		System.out.println("User deleted: "+ customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("User updated: "+ customer.getFirstName());
		
	}
	@Override
	public void addWithAdapter() {
		this.registerService.register();
		
	}
	@Override
	public void signIn(String email, String password) {
		System.out.println("Signed in with correct email and password");
		
	}

}
