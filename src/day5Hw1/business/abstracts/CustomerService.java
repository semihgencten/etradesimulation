package day5Hw1.business.abstracts;

import day5Hw1.entities.concretes.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	void addWithAdapter();
	void signIn(String email, String password);
	
	
}
