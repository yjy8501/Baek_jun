package M_10773;

import java.util.Scanner;
import java.util.Stack;

public class M_10773 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 t
		int t = sc.nextInt();
		// 스택에 있는 모든 수의 합
		int sum = 0;
		int m;

		// 스택 money
		Stack<Integer> money = new Stack<Integer>();


		// 스택에 수를 입력받는다
		for(int i = 0; i < t; i++) {

			m = sc.nextInt();

			// 0이면 최근 값 삭제
			if(m == 0) {
				money.pop();
			}
			// 아니면 스택에 값 저장
			else {
				money.push(m);
			}

		}

		// 스택에 있는 모든 값을 더한다
		for(int s : money) {
			sum = sum + s;
		}
		// 스택에 있는 모든 값의 합
		System.out.println(sum);
	}

}
