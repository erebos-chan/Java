package conversion;
import java.util.Scanner;

public class NameConcatenation {

	public static void main(String[] args) {
		
		//スキャナの準備
			Scanner scan = new Scanner(System.in);
		
		//変数の宣言	
			String familyName,firstName;
		
		//ユーザ入力
			System.out.print("性を入力してください。>>");
				familyName = scan.next();
			
			System.out.print("名を入力してください。>>");
				firstName  = scan.next();
			
		
		//メソッド呼び出し
			nameConcatenation(familyName,firstName);
			
		//スキャナclose
			scan.close();
			

	}

	static void nameConcatenation(String familyName,String firstName){
		System.out.println("あなたの名前は【" + familyName + firstName + "】です。");
	}
}
