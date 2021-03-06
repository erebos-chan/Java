package loop;

import java.util.Scanner;

public class MultiTable_rowS {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rowS, rowE, colS, colE;

		System.out.println("九九表を表示します。");
		System.out.print("開始する段数を入力>>");
		rowS = scan.nextInt();
		System.out.print("終了する段数を入力>>");
		rowE = scan.nextInt();
		System.out.print("開始する列数を入力>>");
		colS = scan.nextInt();
		System.out.print("終了する列数を入力>>");
		colE = scan.nextInt();
		System.out.println();

		multiTable(rowS, rowE, colS, colE);

		scan.close();

	}

	static void multiTable(int rowS, int rowE, int colS, int colE) {

		for (int i = rowS; i <= rowE; i++) {
			System.out.print(i + "の段:");
			for (int j = colS; j <= colE; j++) {
				System.out.printf("%5d ", i * j);

			}
			System.out.println();
		}

	}

}
