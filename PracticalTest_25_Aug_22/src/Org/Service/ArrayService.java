package Org.Service;
import java.util.Scanner;
public class ArrayService {
	public static int calculateAverage(int arr[]) {
		int i,sum=0;
		for(i=0;i<5;i++) {
			sum=sum+arr[i];		
		}return sum/5;
	}
	public static void main(String args[]) {
		
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 elements of the array: ");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int avg=calculateAverage(arr);
		System.out.println("Average of the given array is "+avg);
	}

}
