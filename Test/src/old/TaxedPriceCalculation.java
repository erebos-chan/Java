package old;
import java.util.Scanner;

public class TaxedPriceCalculation {

	public static void main(String[] args) {
		
		//宣言
		int price;
		double taxedPrice;
		
		//ユーザ入力準備
		Scanner scan = new Scanner(System.in);
		
		//入力
		System.out.println("購入金額を入力してください。>");
		price = scan.nextInt();
	
		//計算
		taxedPrice = price * 1.08;
				
		//表示
		System.out.printf("税込価格は、%.0f です。",taxedPrice);
		

	}

}
