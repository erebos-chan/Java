package array;

public class Array_rank {

	public static void main(String[] args) {
		int t[] = { 23, 35, 18, 50 };
		int q[] = { 1, 1, 1, 1 };

		int i = 0;

		for (; i < 4; i++) {
			for (int j = i + 1; j < 4; j++) {
				if (t[i] < t[j]) {
					q[i] = q[i] + 1;
				}
				if (t[i] > t[j]) {
					q[j] = q[j] + 1;

				}
			}

		}
		for (int k = 0; k < 4; k++) {
			System.out.print(t[k]);
			System.out.print(" ");
			System.out.print(q[k]);
			System.out.println("番目");

		}

	}
}