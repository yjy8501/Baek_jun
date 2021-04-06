package M_1920;

import java.util.Arrays;
import java.util.Scanner;

public class M_1920 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열의 크기 입력받는다
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // 비교할 m을 입력받는다
        int m = sc.nextInt();

        // 이분법 시작
        for (int i = 0; i < m; i++) {

            int num = sc.nextInt();
            int left = 0;
            int right = arr.length - 1;

            // 원하는 값을 찾았을 때
            boolean flag = false;

            while (left <= right) {

                int midIndex = (left + right) / 2;
                int midValue = arr[midIndex];

                if (midValue > num) {
                    right = midIndex - 1;
                }

                else if (midValue < num) {
                    left = midIndex + 1;
                }

                else {

                    flag = true;
                    System.out.println(1);
                    break;
                }
            }
            if (!flag) {
                System.out.println(0);
            }
        }
    }
}