package wed_2016_05_11;
import java.util.Scanner;


public class scaner_test {

	public static void main(String[] args) {
		
		int num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("整数を入力してください＞＞");
		num = scan.nextInt();
		
		System.out.println("入力した値は"+ num);
	}

}
