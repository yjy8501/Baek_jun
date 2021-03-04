package M_2164;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class M_2164 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 데크 card 생성
		Deque<Integer> card = new LinkedList<Integer>();

		int n = sc.nextInt();

		// card 안에 입력받은 숫자이하의 숫자를 저장한다
		for(int i = 1; i <= n; i++) {
			card.add(i);
		}

		// 데크 if문을 나눠주기 위한 변수
		int j = 1;

		// card의 크기가 1이 되면 while문을 나온다
		while(card.size() != 1) {

			// 짝수면 데크의 첫 값을 제일 마지막으로 옮긴다
			if(j % 2 == 0) {
				card.addLast(card.pollFirst());
				j++;
			}
			// 홀수면 맨 앞에 있는 숫자를 제거한다
			else {
				card.removeFirst();
				j++;
			}

		}


		System.out.println(card.peekFirst());



	}

}
