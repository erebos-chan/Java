package array;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数＆配列の宣言
		int score[] = new int[5];
		int max = 0;

		// 処理
		for (int i = 0; i < 5; i++) {
			System.out.print("整数を入力>>");
			score[i] = scan.nextInt();
			if (max < score[i]) {
				max = score[i];
			}
		}

		// 最大値表示
		System.out.printf("最大値は『%d』", max);

		// スキャナClose
		scan.close();

	}

}
