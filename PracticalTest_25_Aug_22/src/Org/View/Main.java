package Org.View;
import Org.Service.ArrayService;

import java.util.Scanner;


public class Main {
public void main(String args[]) {
		
		int arr[]=new int[5];
		ArrayService obj=new ArrayService();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements of the array: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		
		int avg=obj.calculateAverage(arr);
		System.out.println("Average of the given array is "+avg);
}

}
