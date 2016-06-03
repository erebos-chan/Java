package loop;

import java.util.Scanner;

public class CountDown_while {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		int number;

		// プロンプト
		System.out.println("カウントダウンを開始します。");

		// ユーザ入力
		System.out.print("スタートの値を入力>>");
		number = scan.nextInt();

		// メソッド呼び出し
		countDown(number);

		// スキャナClose
		scan.close();

	}
	static void countDown(int num){
		int i = num;
		
		while(i > 0){
			System.out.println(i);
			i =i - 1;
		}
	}

}
