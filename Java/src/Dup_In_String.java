import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dup_In_String {

	public static void main(String[] args) {
		String s="harikrishna";
		char[] c=s.toCharArray();
		Map<Character,Integer> m=new HashMap<>();
		
		for (char d : c) {
			if(m.containsKey(d)){
				m.put(d, m.get(d)+1);
			}
			else{
				m.put(d, 1);
			}
			
		}
		
		
		
		for (Character character : m.keySet()) {
			if(m.get(character)>1){
				System.out.println(character+"......"+m.get(character));
			}
			
		}
		
	}

}
