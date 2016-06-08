package while_for;

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {

		// プロンプト
		System.out.println("数当てゲームをします。");

		// メソッド呼び出し
		numberGuessing();

	}

	static void numberGuessing() {
		// スキャナの準備
		Scanner scan = new Scanner(System.in);

		// 変数の宣言
		int num;
		int ans = (int) (Math.random() * 100 + 1);
				//↑↑↑タイプキャスト
		// ユーザ入力＆判定
		while (true) {
			System.out.print("予想を入力してください。>>");
			num = scan.nextInt();
			if (num < ans) {
				System.out.println("それより大きいです。");
			} else if (num > ans) {
				System.out.println("それより小さいです。");
			} else if (num == ans) {
				break;
			}

		}
		// 表示
		System.out.println("正解");

		// スキャナClose
		scan.close();
	}

}
