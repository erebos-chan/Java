package calculation;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		//スキャナの準備
		Scanner scan = new Scanner(System.in);
		
		//変数の宣言
		int dividend,divisor;
		
		//プロンプト
		System.out.println("割り算の計算を行います。");
		
		//ユーザ入力
		System.out.print("割られる数を入力>>");
		dividend = scan.nextInt();
		
		System.out.print("割る数を入力>>");
		divisor = scan.nextInt();
		
		//メソッド呼び出し
		division(dividend,divisor);
		
		//スキャナClose
		scan.close();

	}
	static void division(int dividend,int divisor){
		
	}

}
