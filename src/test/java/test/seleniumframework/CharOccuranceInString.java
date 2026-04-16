package test.seleniumframework;

import org.testng.annotations.Test;

public class CharOccuranceInString {
	
    @Test
	public static void testcharOccurance() {
		// TODO Auto-generated method stub
		String str="aabbbbbccccdddrrr";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			int count=1;
			if(ch[i]=='0') {
				continue;
			}
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
				count++;
				ch[j]='0';
				}
			}
			System.out.print(ch[i]+""+count);
		}

	}

}
