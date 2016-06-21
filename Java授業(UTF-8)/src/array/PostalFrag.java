package array;
import java.util.Scanner;

public class PostalFrag {

	public static void main(String[] args) {
		//スキャナの宣言
		Scanner scan = new Scanner(System.in);
		
		//変数の宣言
		int postalCode;
		
		//プロンプト＆ユーザ入力
	
		System.out.print("郵便番号を入力>>");
		postalCode = scan.nextInt();
		
		
		postalFrag(postalCode);
		
		//スキャナClose
		scan.close();
		

	}
	static void postalFrag(int postalCode){
		int upper3,lower4;
		
		upper3 = postalCode / 10000;
		lower4 = postalCode - (upper3 *10000); 
		
		System.out.printf("〒%03d-%04d",upper3,lower4);
	}

}
