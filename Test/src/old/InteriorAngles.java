package old;
import java.util.Scanner;

public class InteriorAngles {

	public static void main(String[] args) {
	
		//宣言
		int angle1;
		int angle2;
		int angle3;
		
		//ユーザ入力準備
		Scanner scan = new Scanner(System.in);
		
		//入力
		System.out.println("三角形の内角の大きさを求めます。");
		System.out.println("１つ目の内角の大きさを入力してください（整数)。");
		angle1 = scan.nextInt();
		
		System.out.println("2つ目の内角の大きさを入力してください（整数)。");
		angle2 = scan.nextInt();
		
		//計算
		angle3 = 180-angle1-angle2;
		
		//表示
		
		System.out.printf("内角の大きさがそれぞれ %d %d の場合、残りの内角の大きさは、%d　です。",angle1,angle2,angle3);
		
		

	}

}
