
public class PrimeDemo {

	public static void main(String[] args) {
		int n=101;
		int counter=0;
		for(int i=2;i<=n;i++){
			if(i%2!=0){
				System.out.print(i+" ");
				counter++;
			}
		}
		System.out.println();
		System.out.println(counter);
	}

}
