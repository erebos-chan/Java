package while_for;

import java.util.Scanner;

public class ShoppingSimulator {

	public static void main(String[] args) {
		// プロンプト
		System.out.println("合計金額を求めます。");

		// メソッド呼び出し
		shoppingSimulator();

	}

	static void shoppingSimulator() {
		Scanner scan = new Scanner(System.in);
		int price;
		int total = 0;
		int i = 1;

		do {
			System.out.print("商品の金額を入力してください。>>");
			price = scan.nextInt();
			total = total + price;
			System.out.printf("現在までの金額の合計は『%d円』です。", total);
			System.out.println();
			System.out.printf("現在の合計商品数は『%d点』です。", i);
			System.out.println();
			
			i = i + 1;
			if (total < 10000) {
				System.out.println("購入金額が、1万円以下です。引き続き値段を入力して下さい。");
				System.out.println();
			} else {
				System.out.println("購入金額が、1万円を超えました。処理を終了します。");
			}
		} while (total < 10000);

		scan.close();

	}
}
