package loop;

import java.util.Scanner;

public class PrintTrianglePyramid {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		int size;

		// プロンプト
		System.out.println("入力した数値に対応したピラミッドを出力します。");

		// ユーザ入力
		System.out.print("整数を入力してください。>>");
		size = scan.nextInt();

		// メソッド呼び出し
		printTriangleSize(size);

		// スキャナClose
		scan.close();
	}

	static void printTriangleSize(int size) {

		for (int m = size; m > 0; m--) {
			System.out.print(" ");
		}
		System.out.println("*");
		

		for (int i = 0; i < size; i++) {
			for (int k = size - (i + 1); k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}

			for (int l = 0; l < size - (size - 1); l++) {
				{
					System.out.print("*");
				}

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}
}