package array;
import java.util.Scanner;

public class FindMin {

	public static void main(String[] args) {
		//スキャナの準備
		Scanner scan = new Scanner(System.in);
		
		//配列＆変数の宣言
		int num[] = new int[5];
		int min;
		
		//プロンプト＆ユーザ入力
		System.out.println("入力した数値の最小値を求めます。");
		for (int i = 0; i < 5; i++) {
			System.out.print("整数を入力");
			System.out.print(i + 1);
			System.out.print("番目>>");
			num[i] = scan.nextInt();
		}
		//メソッド呼び出し
		min = findMin(num);
		
		//表示
		System.out.printf("最大値は『%d』",min);
		
		//スキャナCLose
		scan.close();

	}
	static int findMin(int num[]){
		int min = 0;
		for(int k = 0;k < 5;k++){
			if(num[k] < min){
				min = num[k];
			}
		}
		
		
	return min;
	}

}
