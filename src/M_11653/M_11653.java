package M_11653;

import java.util.Scanner;

public class M_11653 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정수 N을 입력받는다
		int N = sc.nextInt();

		// 소인수 분해 과정
		for(int i = 2; i <= Math.sqrt(N); i++) {

			// N이 i로 떨어지지 않을 때 까지 실행
			while(N % i == 0) {
				System.out.println(i);

				N = N / i;
			}
		}
		// 나머지 출력
		if(N != 1)
			System.out.println(N);
	}

}
