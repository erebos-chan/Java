package Fri_2016_05_13;
import java.util.Scanner;


public class add_method {

	public static void main(String[] args) {
	
		//変数の宣言
		int num1,num2,sum;
		
		//Scannerの準備
		Scanner scan = new Scanner(System.in);
		
		//ユーザ入力
		System.out.print("1つめの数字を入力してください。>>");
		num1 = scan.nextInt();
		
		System.out.print("2つめの数字を入力してください。>>");
		num2 = scan.nextInt();
		
		//メソッド呼び出し
		sum = add(num1,num2)
;
		//表示
		System.out.printf("加算の結果は、 %d です。",sum);}
	

	
	static int add (int addend1,int addend2){
		int sum;
		sum = addend1 + addend2;
		return sum;
	}

}
