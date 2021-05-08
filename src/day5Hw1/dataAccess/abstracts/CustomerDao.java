package day5Hw1.dataAccess.abstracts;

import java.util.List;

import day5Hw1.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer get(int id);
	List<Customer> getAll();
}
