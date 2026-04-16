package javaCodes;

public class WordOccurenceInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="Java is a Java";
		String org2=org.toLowerCase();
		String str[]=org2.split(" ");
		System.out.println(str.length);
		for(int i=0;i<str.length;i++){
			int count=1;
			if(str[i].equals("0"))
			{
				continue;
			}
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					count++;
					str[j]="0";
				}
			}
			System.out.println(str[i]+"-"+count);
		}

	}

}
