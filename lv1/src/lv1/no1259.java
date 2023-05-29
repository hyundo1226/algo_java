package lv1;

import java.util.Scanner;

public class no1259 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		String str="abc";
		while(true) {
	    str = in.nextLine(); 
	    if(str.equals("0"))
			break;
	     if(check(str)){
	    	 System.out.println("yes");
	     }else {
	    	 System.out.println("no");
	     }

		};
		
		
        in.close();
	}
	public static boolean check(String str) {
		int length = str.length();
		int cnt = length/2;
		for(int i = 0; i < cnt; i++) {
			if (str.charAt(i) != str.charAt(length-1-i)) {
				return false;
			}
		}
		return true;
	}
}
