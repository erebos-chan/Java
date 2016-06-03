package conversion;

import java.util.Scanner;

public class HourToMinuteConversion {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		int hour;

		// プロンプト
		System.out.println("入力した時間を分換算します。");

		// ユーザ入力
		System.out.print("換算したい時間を入力。>>");
		hour = scan.nextInt();

		// メソッド呼び出し
		tourToMinuteConversion(hour);
		
		//スキャナclose
		scan.close();

	}

	static void tourToMinuteConversion(int hour) {
		// 変数の宣言
		int minute;
		
		// 計算
		minute = hour * 60;
		
		// 表示
		System.out.printf("%d 時間を分換算すると %d 分です。",hour,minute);

	}

}
