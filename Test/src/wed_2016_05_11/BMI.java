package wed_2016_05_11;
import java.util.Scanner;


public class BMI {

	public static void main(String[] args) {
		
		//スキャナーの用意
		Scanner scan = new Scanner(System.in);
		
		//変数の宣言
		double weight,height,bmi;
		
		//プロンプト
		System.out.println("BMIの計算をします。");
		
		//ユーザ入力
		System.out.print("身長を入力してください。>>");
		height = scan.nextDouble();
		
	
		System.out.print("体重を入力してください。>>");
		weight = scan.nextDouble();
		
		//計算
		bmi = weight/height/height*10000;
				
		System.out.printf("あなたのBMIは%.1fです。",bmi);
	
	}

}
