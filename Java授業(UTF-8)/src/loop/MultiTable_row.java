package loop;
import java.util.Scanner;


public class MultiTable_row {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int row,col;
		System.out.println("九九表を表示します。");
		System.out.println("表示する段数と列数を入力してください。");
		System.out.print("段数を入力>>");
		row = scan.nextInt();
		System.out.print("列数を入力>>");
		col = scan.nextInt();
		System.out.println();
		
		multiTable(row,col);
		
		scan.close();
		
		


	}
	static void multiTable(int row,int col){
		
		for(int i = 1; i <= row; i ++){
			System.out.print(i + "の段:");
			for(int j = 1; j <= col; j ++){
				System.out.printf("%5d ",i * j );
				
			}
			System.out.println();
		}
		
	}

}
