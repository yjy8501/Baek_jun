package M_1009;

import java.util.Scanner;

public class M_1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t;
		int a;
		int b;

		t = sc.nextInt();



		for (int i = 0; i < t; i++) {

			int n ;

			a = sc.nextInt();
			b = sc.nextInt();

			n = 1;

			for(int j = 0; j < b; j++) {
				n = (n * a) % 10;
				if(n == 0) {
					n = 10;
				}

			}

			System.out.println(n);

		}
	}

}
