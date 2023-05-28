package lv1;

import java.util.Scanner;

public class no2752 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N[] = new int[3];
	    N[0] = in.nextInt(); 
	    N[1] = in.nextInt();
	    N[2] = in.nextInt();
	    
	   for(int i = 0; i<3;i++) {
		   for(int j = i+1; j<3; j++) {
			   int temp;
			   if(N[i]>N[j]) {
				   temp = N[i];
				   N[i] = N[j];
				   N[j] = temp;
			   }
		   }
	   }
	   
	   for(int i = 0; i < 3; i++) {
		   System.out.println(N[i]);
	   }

        in.close();
	}

}
