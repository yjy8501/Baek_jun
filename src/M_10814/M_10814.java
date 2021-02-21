package M_10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class People implements Comparable<People> {

	int age;
	String name;

	public People(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compareTo(People o) {

		return 0;
	}

}

public class M_10814 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		N = sc.nextInt();

		People[] member = new People[N];

		for (int i = 0; i < N; i++) {

			int age;
			String name;

			age = sc.nextInt();
			name = sc.nextLine();

			member[i] = new People(age, name);

		}

		Arrays.sort(member, new Comparator<People>() {

			@Override
			public int compare(People p1, People p2) {
				int p1_age = p1.age;
				int p2_age = p2.age;

				if (p1_age == p2_age) {
					return p1.compareTo(p2);
				}

				return Integer.compare(p1_age, p2_age);
			}

		});

		for (int i = 0; i < member.length; i++) {
			System.out.println(member[i].age + "" + member[i].name);
		}
	}
}
