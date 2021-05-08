package day5Hw1.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Hw1.entities.concretes.Customer;

public class ValidateManager implements ValidateService{
	



	@Override
	public boolean isVerificatedEmail(Customer customer) {
		System.out.println("Validation process succeeded");
		return true;
		
	}



	@Override
	public boolean isValidInfo(Customer customer) {
		Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher =emailPattern.matcher(customer.getEmail());
		boolean isValidEmail=matcher.find();
		
		boolean isValidName=false;
		int firstNameLength=customer.getFirstName().length();
		int lastNameLength=customer.getLastName().length();
		int passwordLength=customer.getPassword().length();
		if(firstNameLength>1  && lastNameLength>1 && passwordLength>5) {
			isValidName=true;
		}
		if(isValidName && isValidEmail) {
			return true;
		}else {
			return false;
		}
	}
}
