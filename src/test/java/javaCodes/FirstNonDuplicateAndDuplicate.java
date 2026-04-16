package javaCodes;

public class FirstNonDuplicateAndDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="FirstNonDuplicateAndDuplicate";
		String org2=org.toLowerCase();
		char ch[]=org2.toCharArray();
		for(int i=0;i<org2.length();i++) {
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
//			if(count==1) {
//			System.out.println("First Non Duplicate:"+ch[i]+""+count);
//			break;
//			}
//for first duplicate			
			if(count>1) {
				System.out.println("First Duplicate:"+ch[i]+""+count);
				break;
			}
		}

	}

}
