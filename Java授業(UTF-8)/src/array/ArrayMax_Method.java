package array;

import java.util.Scanner;

public class ArrayMax_Method {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数＆配列の宣言
		int score[] = new int[5];

		// プロンプト＆ユーザ入力
		System.out.println("入力した数値の最大値を求めます。");
		for (int i = 0; i < 5; i++) {
			System.out.print("整数を入力");
			System.out.print(i + 1);
			System.out.print("番目>>");
			score[i] = scan.nextInt();
		}

		// メソッド呼び出し
		arrayMax(score);

		// スキャナClose
		scan.close();

	}

	static void arrayMax(int score[]) {
		int max = 0;
		for (int k = 0; k < 5; k++) {
			if (max < score[k]) {
				max = score[k];
			}
		}
		System.out.printf("最大値は『%d』", max);
	}

}
