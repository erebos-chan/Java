package old;
import java.util.Scanner;

public class mondai {

	public static void main(String[] args) {
		//変数
		int price;
		int number;
		int total;
		
		//ユーザ入力準備
		Scanner scan = new Scanner(System.in);
		
		//ユーザ入力
		System.out.print("りんごの個数を入力>");
		number = scan.nextInt();
		
		//計算
		price = 100;
		total = price * number;
		
		//表示
		System.out.printf("購入金額は%d円です。",total);
			

	}

}
