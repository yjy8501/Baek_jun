package M_1676;

import java.util.Scanner;

// 팩토리얼 클래스 선언
public class M_1676 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n; // 팩토리얼 값을 구할 숫자의 크기

		// 2가 나오는 횟수를 저장
		int count_two = 0;

		// 5가 나오는 횟수를 저장
		int count_five = 0;

		n = sc.nextInt();

		// 2에서 n까지 실행
		for(int i = 2; i <= n; i++) {

			int temp = i;

			while(temp % 2 == 0) {
				count_two++;
				temp = temp / 2;
			}

			temp = i;

			while(temp % 5 == 0) {
				count_five++;
				temp = temp / 5;
			}

		}


		// count_two 와 count_five를 비교해서 더 작게 나온 변수를 출력한다
		if(count_five <= count_two) {
			System.out.println(count_five);
		}
		else if(count_five > count_two) {
			System.out.println(count_two);
		}

	}
}
