package loop;
import java.util.Scanner;


public class PrintChar {

	public static void main(String[] args) {
		//スキャナの準備
		Scanner scan = new Scanner(System.in);
		
		//変数の宣言
		int time;
		
		//ユーザ入力
		System.out.print("整数を入力>>");
		time = scan.nextInt();
		
		//メソッド呼びだし
		printChar(time);
		
		//スキャナClose
		scan.close();
	}
	static void printChar(int time){
		for(int i  = time; i > 0; i--){
			System.out.print("*");
		}
	}

}
