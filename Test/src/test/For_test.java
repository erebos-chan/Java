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
		System.out.print("�v�Z���鐔�������>>");
		min = scan.nextInt();
		
		System.out.print("�J��Ԃ��񐔂����>>");
		max = scan.nextInt();
		
		//
		for (int i = min; i <= max; i++){
			sum  += i;
		}
		
	System.out.printf("���v��%d�ł��B",sum);
	}

}
