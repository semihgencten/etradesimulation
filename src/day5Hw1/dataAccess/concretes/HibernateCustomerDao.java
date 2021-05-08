package day5Hw1.dataAccess.concretes;

import java.util.List;

import day5Hw1.dataAccess.abstracts.CustomerDao;
import day5Hw1.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println("Added to db with hibernate: "+ customer.getFirstName() );
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Deleted from db with hibernate: "+ customer.getFirstName() );
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Updated with hibernate: "+ customer.getFirstName() );
		
	}

	@Override
	public Customer get(int id) {
		S
		return null;
	}

	@Override
	public List<Customer> getAll() {
		
		return null;
	}

}
