package javaCodes;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="silent";
		String org2="listen";
		char[] ch=org.toCharArray();
		char ch2[]=org2.toCharArray();
		if(org.length()!=org2.length()) {
			System.out.println("Not an Anagram");
		}
		else {
			Arrays.sort(ch);
			Arrays.sort(ch2);
			if(Arrays.equals(ch, ch2)) {
				System.out.println("anagram");
			}
		}

	}

}
