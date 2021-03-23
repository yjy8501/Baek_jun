package M_1181;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class M_1181 {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력 횟수 N을 받는다
		int N = sc.nextInt();

		// 문자열을 저장할 리스트
		List<String> words = new ArrayList<>();

		// 개행문자 제거
		sc.nextLine();

		// 문자열 입력
		for(int i = 0; i < N; i++) {

			String a = sc.nextLine();

			// 리스트 안에 같은 문자열이 있으면 입력받지 않는다
			if(words.contains(a)) {
				continue;
			}
			// 리스트에 저장
			else {
				words.add(a);
			}
		}

		// sort 오버라이딩
		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {

				// 같은 문자열이면 사전 순서대로 정렬
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				// 문자열 길이에 따라 정렬
				else {
					return s1.length() - s2.length();
				}
			}
		});

		//리스트 출력
		for(String s : words) {
			System.out.println(s);
		}
	}

}
