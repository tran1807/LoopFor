package basic.dev;

import java.util.Scanner;

public class songuyenncophailasopolinom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so can kiem tra n = ");
		int n = sc.nextInt();
		int soDaoNguoc = 0;
		int soGoc;
		soGoc=n;
		while(n != 0) {
			int x = n % 10;
			soDaoNguoc = soDaoNguoc * 10 + x;
			n /= 10;
		}
		if(soGoc == soDaoNguoc) System.out.println(soGoc+ " là số đối xứng!!");
		else System.out.println(soGoc+ " không phải là số đối xứng!!");
		
	
	}

}
