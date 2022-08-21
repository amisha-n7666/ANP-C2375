package question1.view;
import question1.model.Customer;
import question1.service.Customerservice;
public class CustomerView {
	public static void main(String[] arg) {

		Customer Customer1 = new Customer(1,"abc",18);
		Customerservice CustService1 = new Customerservice();

		System.out.println(CustService1.isEligibleForVote(Customer1));


		boolean value = CustService1.isEligibleForVote(Customer1);
		if (value) {
			System.out.println("you are elegible for Voting");
		}
		else{
			System.out.println("you are not elegible for Voting");
		}



	}

	

}
