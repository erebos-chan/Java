package switch_;

import java.util.Scanner;

public class Dejimo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("キャラクター名を入力>>");
		String name = scan.next(); // 名前
		int maxhp = 10, hp = maxhp; // 最大体力,体力
		int day = 1; // 経過日数
		String cmd = "0"; // 選択されたメニュー番号

		while (hp > 0) {
			// メニュー表示
			System.out.println("---" + day + "日目 " + name + "の行動メニュー");
			System.out.println("体力:" + hp + "/" + maxhp);
			System.out.println("[1]運動 [2]勉強 [3]睡眠 [4]全回復 [5]限界突破 [8]自殺 [9]終了");
			System.out.println("番号を入力してください。");
			cmd = scan.next();
			
			

				switch (cmd) {
				case "1": // 運動
					System.out.println("***運動しました***");
					hp = hp - 2;
					break;

				case "2": // 勉強
					System.out.println("***勉強しました***");
					hp = hp - 2;
					break;

				case "3": // 睡眠
					System.out.println("***睡眠しました***");
					hp = hp + 2;
					if (hp > maxhp) {
						hp = maxhp;
						
					}
					break;
				
				case "4":	//全回復
					System.out.println("卍卍余裕の全回復卍卍");
					hp = maxhp;
					break;
				
				case "5":
					System.out.println("☆★☆限界突破☆★☆");
					if(maxhp < 100){
					maxhp = 100;
					}else{
						
					maxhp = maxhp + 100;
					}
					break;
					
				case "8":
					System.out.println("††自殺††");
					hp = 0;
					break;
					
				case "9":
					System.out.println("卍卍ゲームを終了します卍卍");
					hp = -100;
					break;

				default: // その他
					System.out.println("その番号はメニューにありません");
					day--;
					break;
				}
				day++;
				System.out.println();

			}

			if(hp == -100){	
			}else{
				if (hp >= 0) {
				System.out.println(name + "は『" + day + "日目』に力尽きた。");
				scan.close();

			}

		}
	}
}