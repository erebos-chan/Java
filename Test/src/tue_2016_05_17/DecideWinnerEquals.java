package tue_2016_05_17;
import java.util.Scanner;

public class DecideWinnerEquals {

	public static void main(String[] args) {
		
		//スキャナの準備
			Scanner scan = new Scanner(System.in);
				
		//変数の宣言
			String playerHand,enemyHand;
			
		//ユーザ入力
			System.out.println("じゃんけんの勝敗を判定します。(グー:チョキ:パー)");
			
			System.out.print("自分の出した手を入力してください。>>");
			playerHand = scan.next();
			
			System.out.print("相手の出した手を入力してください。>>");
			enemyHand  = scan.next();
			
			
		//メソッドの呼び出し
			dicideWinner(playerHand,enemyHand);
	}

	static void dicideWinner(String playerHand,String enemyHand){
		if( (playerHand.equals("グー") & enemyHand.equals("チョキ"))|
		  (playerHand.equals("チョキ") & playerHand.equals("パー"))|
		  (playerHand.equals("パー")   & enemyHand.equals("グー"))) {
			System.out.println("【自分の勝ち】");
		}else{
			if(playerHand.equals(enemyHand)){
				System.out.println("【あいこ】");
			}else{
				System.out.println("【相手の勝ち】");
			}
		}
		
	}

}
