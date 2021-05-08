package day5Hw1.core;

import day5Hw1.entities.concretes.Customer;

public interface ValidateService {
	boolean isVerificatedEmail(Customer customer);
	boolean isValidInfo(Customer customer);
}
