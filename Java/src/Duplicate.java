import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String s="harikrishna";
		char[] c=s.toCharArray();
		Set<Character> set=new HashSet<>();
		for (Character character : c) {
			if(set.add(character)==false){
				System.out.print(character);
			}
		}

	}

}
