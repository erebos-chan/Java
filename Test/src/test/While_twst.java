package test;
import java.util.Scanner;

public class While_twst {

	public static void main(String[] args) {
		
		//
		Scanner scan = new Scanner(System.in);
		
		//
		int test;
		
		
		System.out.print("100�ȉ��̐��������>>");
		test = scan.nextInt();
		
		//
		while(test >= 100){
			System.out.print("100�ȉ��̐��������>>");
			test = scan.nextInt();
		}

	}

}
