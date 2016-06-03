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
		System.out.print("ŒvŽZ‚·‚é”Žš‚ð“ü—Í>>");
		min = scan.nextInt();
		
		System.out.print("ŒJ‚è•Ô‚·‰ñ”‚ð“ü—Í>>");
		max = scan.nextInt();
		
		//
		for (int i = min; i <= max; i++){
			sum  += i;
		}
		
	System.out.printf("‡Œv‚Í%d‚Å‚·B",sum);
	}

}
