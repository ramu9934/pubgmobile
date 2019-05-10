
public class FirstCharFromEveryWord {

	public static void main(String[] args) {
		String s="welcome to the java";
		
		String[] words=s.split(" ");
		for (String string : words) {
			String c=string;
			System.out.print(c.charAt(1));
				
			
		}

	}

}
