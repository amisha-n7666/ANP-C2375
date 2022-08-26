package day13;

public enum Mobile {
SAMSUNG(20000),LENOVO(15000),IPHONE(65000);
	
	int prize;
	Mobile(int prize){
		
		this.prize=prize;
	}
	
	int returnPrize() {
		return prize;
	}
	
	

}
