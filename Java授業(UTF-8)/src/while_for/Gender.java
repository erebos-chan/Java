package while_for;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {

		// プロンプト
		System.out.println("性別をチェックします。");

		// メソッド呼び出し
		gender();

	}

	static void gender() {
		Scanner scan = new Scanner(System.in);
		int gender;
		while (true) {
			System.out.print("男性:1 女性:0 を入力>>");
			gender = scan.nextInt();
			if (gender == 1) {
				break;
			} else if (gender == 0) {
				break;
			}
		}
		scan.close();
	}

}
