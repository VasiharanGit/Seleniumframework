package javaCodes;

public class NonDuplicateCharAndCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="NonDuplicateCharAndCount";
		String org2=org.toLowerCase();
		char ch[]=org2.toCharArray();
		for(int i=0;i<org2.length();i++){
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
			if(count==1) {
				
			
			System.out.println(ch[i]+""+count);
			}
		}

	}

}
