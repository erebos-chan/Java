package array;
import java.util.Scanner;
public class Statistics2D_User3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("行数を入力>>");
		int n = scan.nextInt();
		
		System.out.print("列数を入力>>");
		int m = scan.nextInt();
		
		double[][] num = new double[n][m+1];
		double sum_x = 0;
		for(int i = 0; i < n;i++){
			sum_x = 0;
			for(int j = 0;j < m;j++){
				System.out.printf("%d行目　%d列目の数を入力>>",i + 1,j + 1);
				num[i][j] = scan.nextDouble();
				sum_x = sum_x + num[i][j];
				
			}
			num[i][m]  = sum_x / m;
			System.out.println(sum_x);
			System.out.println(num[i][m]);
			
		}
		
		num = statistics2D(num);
		
		scan.close();

	}
	static double statistics2D(double num[][]){
		double sum,ave;
		int i = 0;
		int j = 0;
		sum = 0;
		
		for(;i < num.length;i++){
			for(j = 0;j < num[i].length;j++){
			
				sum = sum + num[i][j];
			}
		}
		
		ave = sum / (i * (j));
		System.out.printf("合計は『%.2f』",sum);
		System.out.printf("平均は『%.2f』",ave);
		return 
	}

}
