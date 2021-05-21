package basic.dev;

public class cacso100den999chiahetcho3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Các số lớn hơn 99 và bé hơn 1000 có tổng các chữ số chia hết cho 3 là: ");
			int i;
			int a,b,c;
			
		
			for(i=100;i<1000;i++){
				int x = i;
				a= x/100;
				b= (x%100)/10;
				c=(x%100)%10;
				int d = a+ b +c;
				if (d % 3 == 0) 
					System.out.print(+i+"\n");
				
			
	}
	}
}

