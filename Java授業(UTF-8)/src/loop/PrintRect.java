package loop;
import java.util.Scanner;

public class PrintRect {

	public static void main(String[] args) {
		//スキャナ
		Scanner scan = new Scanner(System.in);
		
		//変数
		int n,m;
		
		//プロンプト＆ユーザ入力
		System.out.println("指定されたサイズの四角形を出力します。");
		
		System.out.print("縦を入力>>");
		n = scan.nextInt();
		
		System.out.print("横を入力>>");
		m = scan.nextInt();
		
		printBox(n,m);
		
		scan.close();

	}
	static void printBox(int n,int m){
		for(int i = 1;i <= n;i++){
			for(int j = 1; j<= m;j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
