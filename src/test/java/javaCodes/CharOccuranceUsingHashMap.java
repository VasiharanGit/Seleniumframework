package javaCodes;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		Map<Character,Integer>map=new HashMap();
		for(char ch: str.toCharArray()) {
			if(ch==' ') {
				continue;
			}
			map.put(ch,map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer>mapp:map.entrySet()) {
			if(mapp.getValue()>1) {
		
				System.out.println(mapp);
			}
	}

}
}