
public class CountNumOfDigits {
	
	public static int digits(long n){
		int count=0;
		while(n!=0){
			n=n/10;
			count++;
		}
		
		return count;
	}

	public static void main(String[] args) {
		long n=12345;
		
		System.out.println(digits(n));

	}

}
