package service;

public class service {
	public class Service {
		public static int calculateDifference(int n) {
			 int sum1=0,sum2=0,sum=0;
				for(int i=1;i<=3;i++)
				{
					sum1=sum1+(i*i);
					sum2=sum2+i;
				}	sum=sum1-(sum2*sum2);
				
				return sum;
	}

	}
