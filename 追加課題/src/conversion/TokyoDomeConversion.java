package conversion;

import java.util.Scanner;

public class TokyoDomeConversion {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		double tdarea, area;

		// 東京ドームの面積の代入
		tdarea = 46755;

		// プロンプト
		System.out.println("入力した面積が東京ドーム何個分か計算します。");

		// ユーザ入力
		System.out.print("比べたい面積(㎡)を入力してください。>>");
		area = scan.nextDouble();

		// メソッド呼び出し
		tokyoDomeConversion(tdarea, area);

		// スキャナのclose
		scan.close();
	}

	static void tokyoDomeConversion(double tdarea, double area) {
		// 変数の宣言
		double equivalent;

		// 計算と代入
		equivalent = area / tdarea;

		// 表示
		System.out.printf("入力した面積は東京ドーム %.1f 個分です。", equivalent);

	}

}
