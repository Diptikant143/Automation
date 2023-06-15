package JAVA;

public class Pro1 {

	public static void main(String[] args) {
		
		String s="01234";

		String ans="";

		for(int i=0;i<s.length();i++) {

		if(s.charAt(i)=='0') {

		continue;

		}

		else {

		ans+=s.charAt(i);

		}

		}

	

		System.out.println(ans);
	}
}

		

		
     
     
	
	


