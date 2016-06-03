package conversion;

import java.util.Scanner;

public class CharacterAt {

	public static void main(String[] args) {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		String str;
		int position;

		// プロンプト
		System.out.println("入力した文字列の中の指定した場所の文字を抜き出します。");

		// ユーザ入力
		System.out.print("文字列を入力>>");
		str = scan.next();
		System.out.print("抜き出す文字の位置を入力>>");
		position = scan.nextInt();

		// メソッド呼び出し
		characterAt(str, position);

		// スキャナClose
		scan.close();
	}

	static void characterAt(String str, int position) {
		// 変数の宣言
		char c;

		// 抜き出し
		c = str.charAt(position - 1);

		// 表示
		System.out.println("指定した文字は『" + c + "』です。");
	}

}
