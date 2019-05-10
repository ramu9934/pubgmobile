import java.util.*;
public class Char_frequency{

	public void frequency(String s){
		char[] c=s.toCharArray();
		Map<Character,Integer> m=new HashMap<>();
		for(Character c1:c){
			if(m.containsKey(c1)){
				m.put(c1,m.get(c1)+1);
			}
			else{
				m.put(c1,1);
			}
		}
		for (char d : m.keySet()) {
			if(m.get(d)>1){
				System.out.println(d+"-"+m.get(d));
			}
			
		}
	}
public static void main(String[] args){
	Char_frequency ch=new Char_frequency();
	ch.frequency("harikrishna");
}
}