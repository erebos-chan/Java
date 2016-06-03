package wed_2016_05_11;
import java.util.Scanner;

public class FromCelsius {

	public static void main(String[] args) {
		
		//スキャナーの用意
				Scanner scan = new Scanner(System.in);
				
				//変数の宣言
				double celsius,fahrenheit,kelvin;
				
				//プロンプト
				System.out.println("温度変換を行います。");
				
				//ユーザ入力
				System.out.print("摂氏を入力してください。>>");
				celsius = scan.nextDouble();
				
				//計算
				fahrenheit = celsius * 1.8 + 32;
				kelvin     = celsius + 273.15;
				
						
						
				System.out.printf("摂氏%.1f度は、華氏%.1fです。",celsius,fahrenheit);
				System.out.println();
				System.out.printf("摂氏%.1f度は、ケルビン%.1fです。",celsius,kelvin);
	}

}
