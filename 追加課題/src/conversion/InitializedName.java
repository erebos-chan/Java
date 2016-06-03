package conversion;
import java.util.Scanner;

public class InitializedName {

	public static void main(String[] args) {
		//スキャナの準備
		Scanner scan = new Scanner(System.in);
		
		//変数の準備
		String familyName,firstName;
		
		//プロンプト
		System.out.println("名前のイニシャルを表示します。");
		
		//ユーザ入力
		System.out.print("姓を入力(ローマ字)>>");
		familyName = scan.next();
		
		System.out.print("名を入力(ローマ字)>>");
		firstName = scan.next();
		
		//メソッド呼び出し
		initializedName(familyName,firstName);
		
		//スキャナClose
		scan.close();

	}
	
	static void initializedName(String familyName,String firstName){
		
	}

}
