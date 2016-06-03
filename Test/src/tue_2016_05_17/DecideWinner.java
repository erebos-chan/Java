package tue_2016_05_17;
import java.util.Scanner;

public class DecideWinner {

	public static void main(String[] args) {
		 
		//スキャナの準備
		Scanner scan = new Scanner(System.in);
		
		//変数の宣言
		int playerHand,enemyHand;
		
		//ユーザ入力
		System.out.println("じゃんけんの勝敗を判定します。(グー→0,チョキ→1,パー→2)");
		System.out.print("自分の出した手を入力してください。>>");
		playerHand = scan.nextInt();
		System.out.print("相手の出した手を入力してください。>>");
		enemyHand  = scan.nextInt();
		
		//メソッドの呼び出し
		dicideWinner(playerHand,enemyHand);
		
		

	}
	
	static void dicideWinner(int playerHand,int enemyHand){
		if( (playerHand == 0 & enemyHand == 1)|
		  (playerHand == 1 & enemyHand == 2)|
		  (playerHand == 2 & enemyHand == 0)) {
			System.out.println("【自分の勝ち】");
		}else{
			if(playerHand == enemyHand){
				System.out.println("【あいこ】");
			}else{
				System.out.println("【相手の勝ち】");
				
			}
		}
		
	}

}
