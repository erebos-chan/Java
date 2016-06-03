package calculation;
import java.util.Scanner;

public class BoxSurfaceArea {

	public static void main(String[] args) {
		//スキャナの準備
		Scanner scan = new Scanner(System.in);
		
		//変数の宣言
		int sideLenght;
		
		//プロンプト
		System.out.println("立方体の表面積を求めます。");
		
		//ユーザ入力
		System.out.print("1辺の長さを入力>>");
		sideLenght = scan.nextInt();
		
		//メソッド呼び出し
		boxSurfaceArea(sideLenght);
		
		//スキャナClose
		scan.close();

	}
	static void boxSurfaceArea(int sideLenght){
		//変数の宣言
		int surfaceArea;
		
		//計算
		surfaceArea = sideLenght * sideLenght * 6;
		
		//表示
		System.out.printf("立方体の表面積は『%d』です。",surfaceArea);
	}
}
