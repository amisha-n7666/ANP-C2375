package question1.service;
import question1.model.Customer;
public class Customerservice {
	public boolean isEligibleForVote(Customer s){
		boolean result = false;
		int Age = s.getAge();
		if (Age>=18){
			result = true;
		}
		else {
			result = false;	
		}
		return result;


	}


}
