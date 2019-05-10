
public class FindElementInArray {
	
	public static boolean contains(int[] a, int item){
		
		for (int i : a) {
			if(item==i){
				return true;
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] b={2015,2016,2017,2018,2019};
		System.out.println(contains(b,2019));

	}

}
