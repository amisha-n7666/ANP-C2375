package question3;

public class swap {
	public static void main(String[] arg) {

		int a =103;
		int b = 102;

		System.out.println("befor swaping a = "+a);
		System.out.println("befor swaping b = "+ b);

		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("After Swapping a = "+a);
		System.out.println("After Swapping b = "+b);



	}


}
