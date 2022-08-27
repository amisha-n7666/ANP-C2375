package question2;

public class Executeclass {public static void main(String[] args) {
	// TODO Auto-generated method stub
	RBI obj;
	obj = new SBI();
	System.out.println("SBI rate of interest : " + obj.getInterestRate());
	System.out.println("SBI withdrawal limit : " + obj.getwithdrawalLimit());
	obj = new ICICI();
	System.out.println("ICICI rate of interest : " + obj.getInterestRate());
	System.out.println("ICICI withdrawal limit : " + obj.getwithdrawalLimit());
	obj = new PNB();
	System.out.println("PNB rate of interest : " + obj.getInterestRate());
	System.out.println("PNB withdrawal limit : " + obj.getwithdrawalLimit());
	

}


}
