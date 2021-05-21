package basic.dev;

import java.util.Scanner;

public class tongcacsochiahetcho3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập n = ");
    int n = sc.nextInt();
    int i=0;
    int s=0;
    for(i = 0; i <= n; i++) {
    	if(i % 3 == 0) 
    		s=s+i;
    	System.out.print(s+"\n");
    
	}
	}
}
