package calculation;

import java.util.Scanner;

public class BMICalculation {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		double weight, height;

		// プロンプト
		System.out.println("BMIの計算をします。");

		// ユーザ入力
		System.out.print("体重を入力>>");
		weight = scan.nextDouble();

		System.out.print("身長を入力>>");
		height = scan.nextDouble();

		// メソッド呼び出し
		bmiCalculation(weight, height);

		// スキャナClose
		scan.close();

	}

	static void bmiCalculation(double weight, double height) {
		// 変数の宣言
		double bmi;

		// 計算
		bmi = weight / (height * height) * 10000;

		// 表示
		System.out.printf("あなたのBMIは『%.1f』です。", bmi);
	}

}
