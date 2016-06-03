package Fri_2016_05_13;
import java.util.Scanner;

public class fourOperations {

	public static void main(String[] args) {
		//変数の宣言
		int num1,num2,sum,dif,product,quotient;
		
		//スキャナーの準備
		Scanner scan = new Scanner(System.in);
		
		//ユーザー入力
		System.out.println("計算したい値を入力してください。");
		System.out.print("1つめの数字を入力してください。>>");
		num1 = scan.nextInt();
		
		System.out.print("2つめの数字を入力してください。>>");
		num2 = scan.nextInt();
		
		//メソッド呼び出し
		sum = add(num1,num2);
		dif = sub(num1,num2);
		product = mult(num1,num2);
		quotient = div(num1,num2);
		
		//表示
		System.out.printf("加算の結果は%dです。",sum);
		System.out.printf("減算の結果は%dです。",dif);
		System.out.printf("乗算の結果は%dです。",product);
		System.out.printf("除算の結果は%dです。",quotient);
		
	}
	
	static int add(int addend1,int addend2){
		int sum;
		sum = addend1 + addend2;
		return sum;
		
		
	}
	
	static int sub(int minuend,int subtrahend){
		int difference;
		difference = minuend - subtrahend;
		return difference;
				
	}
	
	static int mult(int multplicand,int multiplier){
		int product;
		product = multplicand * multiplier;
		return product;
		
	}
	
	static int div(int dividend,int divisor){
		int quotient;
		quotient = dividend / divisor;
		return quotient;
		
	}

}
