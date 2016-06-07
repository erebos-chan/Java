package array;

import java.util.Scanner;

public class ScoreStatisticsArray {

	public static void main(String[] args) {

		// メソッド呼び出し
		scoreStatisticsArray();

	}

	static void scoreStatisticsArray() {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 配列の宣言
		int score[] = new int[5];
		int sum = 0;
		int avg;
		for (int i = 0; i < 5; i++) {
			System.out.print("点数を入力");
			System.out.print(i + 1);
			System.out.print("人目");
			score[i] = scan.nextInt();
			sum = sum + score[i];
		}
		avg = sum / 5;
		System.out.printf("合計『%d』", sum);
		System.out.println();
		System.out.printf("平均は『%d』", avg);
		
		scan.close();

	}
}
