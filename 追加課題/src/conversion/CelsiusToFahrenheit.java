package conversion;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		double celsius;

		// プロンプト
		System.out.println("温度変換を行います。");

		// ユーザ入力
		System.out.print("摂氏(℃)で温度を入力してください。>>");
		celsius = scan.nextDouble();

		// メソッド呼び出し
		celsiusToFahrenheit(celsius);

		// スキャナClose
		scan.close();
	}

	static void celsiusToFahrenheit(double celsius) {
		// 変数の宣言
		double fahrenheit, kelvin;

		// 計算
		fahrenheit = celsius * 1.8 + 32;
		kelvin = celsius + 273.15;

		// 表示
		System.out.println("変換結果は");
		System.out.printf("華氏『%.2f』度です。", fahrenheit);
		System.out.println();
		System.out.printf("ケルビン『%.2f』度です。", kelvin);

	}

}
