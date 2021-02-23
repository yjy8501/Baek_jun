package M_1316;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M_1316 {

	public static boolean check(List l, String string) {

		boolean a = l.contains(string);

		return a;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t; // 테스트 케이스

		List<String> words = new ArrayList<String>();

		t = sc.nextInt();
		sc.nextLine();

		int group = t; //그룹 단어 수

		// 문자 입력받기
		for(int i = 0; i < t; i++) {

			String a = sc.nextLine();
			words.add(a);
		}


		// 문자 비교
		// 테스트 케이스 만큼
		for(int i = 0; i < t; i++) {

			String pre;
			List<String> word = new ArrayList<String>();

			pre = words.get(i).substring(0, 1);
			word.add(pre);


			// 입력 받은 단어를 돈다
			for(int j = 1; j < words.get(i).length(); j++) {

				if(pre.equals(words.get(i).substring(j, j+1))) {
					//System.out.println("같습니다");
					continue;
				}
				else {
					//System.out.println("다릅니다");
					if(check(word,words.get(i).substring(j, j+1)) == true) {
						//System.out.println("그룹문자 아님");
						group--;
						break;
					}
					else {
						//System.out.println("배열에 저장");
						pre = words.get(i).substring(j, j+1);
						word.add(words.get(i).substring(j, j+1));
					}
				}
			}
		}
		System.out.println(group);
	}
}
