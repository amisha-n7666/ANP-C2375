package view;
import Service.Service;

public class Main {
	public static void main(String args[]){
		int n=3 ;
		Service obj1=new Service();
		int a=obj1.calculateDifference(n);
		
		System.out.println(+a);
	}

}
