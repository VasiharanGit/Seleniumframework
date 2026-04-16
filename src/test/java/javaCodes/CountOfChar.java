package javaCodes;

public class CountOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="CountOfChar";
		String org2=org.toLowerCase();
		 char[] ch=org2.toCharArray();
		for(int i=0;i<org.length();i++) {
			int count=1;
			if(ch[i]=='0') {
				continue;
			}
			for(int j=i+1;j<org2.length();j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
			}
			System.out.print(ch[i]+""+count);
		}

	}

}
