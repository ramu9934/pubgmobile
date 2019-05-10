
public class Pattern {

	public static void main(String[] args) {
		int i,j,k,n=5;
		
		for(i=n;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("  ");
			}
			for( k=n;k>i;k--){
				System.out.print("2 ");
			}
			
			System.out.println();
		}

	}

}
