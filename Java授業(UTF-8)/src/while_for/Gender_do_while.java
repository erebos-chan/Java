package while_for;

import java.util.Scanner;

public class Gender_do_while {

	public static void main(String[] args) {
		// メソッド呼び出し
		gender();

	}

	static void gender() {
		int gender;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("性別を入力 男性:1 女性:0>>");
			gender = scan.nextInt();
		} while ((gender != 0) & (gender != 1));
		
		scan.close();

	}
}
