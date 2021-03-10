package M_1934;

import java.util.Scanner;

public class M_1934 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스를 입력받는다
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {

			// 자연수 A
			int a = sc.nextInt();
			// 자연수 B
			int b = sc.nextInt();
			// 최소 공배수
			int min = 0;

			// a의 공배수를 저장하는 수
			int sumA = a;
			// b의 공배수를 저장하는 수
			int sumB = b;

			// a,b의 공배수를 구하기 위해 곱해지는 수
			int countA = 2;
			int countB = 2;

			while(true) {

				// 같으면 최소공배수
				if(sumA == sumB) {
					min = sumA;
					break;
				}
				// a의 공배수가 더 크면 b의 공배수를 키운다
				else if(sumA > sumB){
					sumB = b * countB;
					countB++;
				}
				// b의 공배수가 더 크면 a의 공배수를 키운다
				else {
					sumA = a * countA;
					countA++;
				}
			}
			// 최소 공배수 출력
			System.out.println(min);
		}

	}

}
