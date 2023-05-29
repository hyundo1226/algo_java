package lv1;

import java.util.Scanner;

public class no1264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		String str;
		while(true) {
	    str = in.nextLine(); 
	    if(str.equals("#"))
			break;
	     System.out.println(check(str));

		};
		
		
        in.close();
	}
	public static int check(String str) {
		int length = str.length();
		int cnt = 0;
	    char aeiou[] = {'a','e','i','o','u','A','E','I','O','U'};
		for(int i = 0; i <length; i++) {
			for(int j = 0; j<10; j++){
				if (str.charAt(i) == aeiou[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
