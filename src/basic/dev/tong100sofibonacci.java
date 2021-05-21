package basic.dev;

public class tong100sofibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("100 số fibonacci đầu tiên: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(fibonacci(i) + " ");
        }
	}
            
     public static int fibonacci(int n) {
                if (n < 0) {
                    return -1;
                } else if (n == 0 || n == 1) {
                    return n;
                } else {
                    return fibonacci(n - 1) + fibonacci(n - 2);
	}
            }
}
