package array;
import java.util.Scanner;
public class Statistics2D_User2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("行数を入力>>");
		int n = scan.nextInt();
		
		System.out.print("列数を入力>>");
		int m = scan.nextInt();
		
		double[][] num = new double[n+1][m+1];
		double sum_x = 0;
		for(int i = 0; i < n;i++){
			sum_x = 0;
			for(int j = 0;j < m;j++){
				System.out.printf("%d行目　%d列目の数を入力>>",i + 1,j + 1);
				num[i][j] = scan.nextDouble();
				sum_x = sum_x +  num[i][j]; 
			}
			
			
			
		}
		
		statistics2D(num,m,n,sum_x);
		System.out.println(num);
		scan.close();

	}
	static double[][] statistics2D(double[][] num,int m,int n,double sum_x){
		for(int i = 0; i > m;i++){
			sum_x = num[i][n+1]; 
		}
		
		
		return num;
	}

}
