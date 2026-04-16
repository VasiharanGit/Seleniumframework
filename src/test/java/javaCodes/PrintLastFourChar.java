package javaCodes;

public class PrintLastFourChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String org="PrintLastFourChar";
		String result="";
		for(int i=org.length()-4;i<org.length();i++) {
			result+=org.charAt(i);
		}
		System.out.println(result);

	}

}
