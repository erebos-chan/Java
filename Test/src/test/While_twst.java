package test;
import java.util.Scanner;

public class While_twst {

	public static void main(String[] args) {
		
		//
		Scanner scan = new Scanner(System.in);
		
		//
		int test;
		
		
		System.out.print("100以下の数字を入力>>");
		test = scan.nextInt();
		
		//
		while(test >= 100){
			System.out.print("100以下の数字を入力>>");
			test = scan.nextInt();
		}

	}

}
