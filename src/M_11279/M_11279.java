package M_11279;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class M_11279 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 우선순위 큐 선언
		PriorityQueue<Integer> MaxHeap = new PriorityQueue<>(Collections.reverseOrder());

		// 입력횟수 입력
		int N = sc.nextInt();

		for(int i = 0; i < N; i++) {

			// 값 입력받기
			int x = sc.nextInt();

			// 입력받은 값이 0이면 실행
			if( x == 0) {

				// 큐가 비어있으면 0을 출력
				if(MaxHeap.isEmpty() == true) {
					System.out.println(0);
				}
				// 아니면 최댓값 출력
				else {
					System.out.println(MaxHeap.poll());
				}

			}

			// 그 이외의 값을 입력받으면 큐에 저장
			else {
				MaxHeap.add(x);

			}
		}
	}
}
