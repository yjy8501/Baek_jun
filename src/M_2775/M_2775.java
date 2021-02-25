package M_2775;

import java.util.Scanner;

public class M_2775 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		// 아파트 배열
		int[][] intArray = new int[15][15];

		// 아파트 인원 수 초기값
		for (int i = 0; i < intArray.length; i++) {
			intArray[0][i] = i+1;
			intArray[i][0] = 1;

		}

		// 아파트 인원 수 저장
		for (int i = 1; i < intArray.length; i++) {
			for (int j = 1; j < intArray.length; j++) {
				intArray[i][j] = intArray[i - 1][j] + intArray[i][j - 1];
			}
		}

		for(int i = 0; i < t; i++) {

			int k = sc.nextInt(); // 층
			int n = sc.nextInt(); // 호실

			// 요구하는 k층 n호실 인원 수 출력
			System.out.println(intArray[k][n-1]);

		}


		// 아파트 배열 전체 출력하기
		  for (int i = 0; i < intArray.length; i++) { for (int j = 0; j <
		  intArray.length; j++) { System.out.print(intArray[i][j]+" "); }
		  System.out.println(); }

	}

}
