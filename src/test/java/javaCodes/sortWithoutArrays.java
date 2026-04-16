package javaCodes;

import java.util.Arrays;

public class sortWithoutArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2,1,5,4,3};
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				//System.out.println(num[i]+"----"+num[j]);
				if(num[i]>num[j]) {
					int result=num[i];
					num[i]=num[j];
					num[j]=result;
					
				}
				//System.out.println(Arrays.toString(num));
				
			}
			System.out.println(Arrays.toString(num));
		}
		
		}

	}


//a = 5;
//b = 7;
//
//temp = a;  
//a = b;  //a 7
//b = temp; // b 5
//
//a = a + b; 7+5 = 12. // a 5 5+7=12
//b = a - b; 12-5 = 7  // b 7 12-7=5
//a = a - b; 12-7 = 5  // a=a-b 12-5 7

//2>1
//result=2
//