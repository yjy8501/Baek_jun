package M_9012;

import java.util.Scanner;
import java.util.Stack;

public class M_9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int t = sc.nextInt();
		sc.nextLine();

		// 테스트 케이스 만큼 실행된다
		for(int i = 0; i < t; i++) {

			// 문자열을 입력받는다
			String Ps = sc.nextLine();
			Stack<String> Vps = new Stack<String>();
			// YES or NO를 결정짓는 check
			boolean check = true;

			// 문자열의 길이만큼 실행된다
			for(int j = 0; j < Ps.length(); j++) {

				// '(' 이면 push
				if(Ps.charAt(j) == '(') {
					Vps.push("(");
				}

				// ')' 이면 pop
				else if(Ps.charAt(j) == ')') {

					if(Vps.size() != 0)
						Vps.pop();

					// Vps의 크기가 0인데 )를 입력받을 경우 check를 false로 설정
					else {
						check = false;
						break;
					}

				}
			}

			// YES or NO를 출력시킨다
			if(Vps.size() == 0 && check == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}

	}

}
