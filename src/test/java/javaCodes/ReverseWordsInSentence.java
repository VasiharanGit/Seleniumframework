package javaCodes;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="java is a program";
		String str[]=org.split(" ");
		String result="";
		for(int i=str.length-1;i>=0;i--) {
			result+=str[i]+" ";
		}
		System.out.println(result.trim());

	}

}
