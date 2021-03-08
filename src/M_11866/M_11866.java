package M_11866;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M_11866 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		// 1 ~ N까지의 수가 저장될 큐
		Queue<Integer> arr = new LinkedList<Integer>();
		// 요세푸스 수열을 저장하기 위한 리스트
		LinkedList<Integer> Jose = new LinkedList<Integer>();

		// N과 K를 입력받는다
		int N = sc.nextInt();
		int K = sc.nextInt();

		// 큐에 1 ~ N까지의 수를 저장한다
		for(int i = 1; i <= N; i++) {
			arr.add(i);
		}

		// 요세푸스 수열을 구하다
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < K-1; j++) {
				arr.add(arr.poll());
			}
			Jose.add(arr.poll());

		}

		// 요세푸스 수열을 출력한다
		System.out.print("<");

		for(int i = 0; i < N; i++) {
			System.out.print(Jose.poll());

			if(Jose.size() >= 1) {
				System.out.print(", ");
			}
		}
		System.out.print(">");
	}

}
