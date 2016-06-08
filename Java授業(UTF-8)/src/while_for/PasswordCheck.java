package while_for;

import java.util.Scanner;

public class PasswordCheck {

	public static void main(String[] args) {
		// スキャナの宣言
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		String pass;

		// パスワード設定
		System.out.print("パスワードの設定>>");
		pass = scan.next();

		// プロンプト
		System.out.println("パスワードチェックをします。");

		// メソッド呼び出し
		passwordCheck(pass);

		// スキャナClose
		scan.close();

	}

	static void passwordCheck(String pass) {
		// スキャナの宣言
		Scanner scan2 = new Scanner(System.in);

		// 変数の宣言
		String word;

		// ユーザ入力＆処理

		while (true) {
			System.out.print("パスワードを入力>>");
			word = scan2.next();
			if (word.equals(pass)) {
				System.out.println("ログイン正解");
				break;

			} else {
				System.out.println("一致しません");

			}
		}
		// スキャナClose
		scan2.close();
	}

}
