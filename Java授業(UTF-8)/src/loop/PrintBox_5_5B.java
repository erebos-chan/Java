package loop;
import java.util.Scanner;

public class PrintBox_5_5B {

	public static void main(String[] args) {
		
		//スキャナ
		Scanner scan = new Scanner(System.in);
		
		//変数
		int spaceNum;
		
		//プロンプト＆ユーザ入力
		System.out.println("5×5のボーダーの四角形を出力します。");
		System.out.print("スペースの幅を入力>>");
		spaceNum = scan.nextInt();
		
		
		
		
		printBox(spaceNum);
		
		scan.close();

	}
	static void printBox(int spaceNum){
		for(int i = 1;i < 6;i++){
			for(int j = 0; j< spaceNum;j++){
				System.out.print("*");
				for(int k = spaceNum; k > 0 ; k--)
				System.out.print(" ");
				
				
			}
			System.out.println();
			
		}
	}

}
