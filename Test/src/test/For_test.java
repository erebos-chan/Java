package test;
import java.util.Scanner;

public class For_test {

	public static void main(String[] args) {
		
		//
		Scanner scan = new Scanner(System.in);
		
		//
		int sum = 0;
		int min,max;
		
		//
		System.out.print("計算する数字を入力>>");
		min = scan.nextInt();
		
		System.out.print("繰り返す回数を入力>>");
		max = scan.nextInt();
		
		//
		for (int i = min; i <= max; i++){
			sum  += i;
		}
		
	System.out.printf("合計は%dです。",sum);
	}

}
