package loop;

public class Summation_while {

	public static void main(String[] args) {

		summtion();

	}

	static void summtion() {
		int i = 0;
		int sum = 0;

		while (i < 10) {
			i = i + 1;
			sum = sum + i;

		}
		System.out.printf("合計は『%d』です。", sum);
	}

}
