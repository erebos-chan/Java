package conversion;

import java.util.Scanner;

public class NumberTruncation {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		int number;

		// プロンプト
		System.out.println("入力した整数の1の位を切り捨てて表示します。");

		// ユーザ入力
		System.out.print("整数を入力>>");
		number = scan.nextInt();

		// メソッド呼び出し
		numberTruncation(number);

		// スキャナclose
		scan.close();

	}

	static void numberTruncation(int number) {
		// 変数の宣言
		int truncated;

		// 変換
		truncated = number - number % 10;

		// 表示
		System.out.printf("切捨て後の数値は『%d』です。", truncated);

	}
}