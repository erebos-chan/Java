package array;

public class Statistics2D {

	public static void main(String[] args) {
		double[][] num  = {{10.0,20.0,30.0},{40.0,50.0,60,0}};
		
		
		
		statistics2D(num);

	}
	static void statistics2D(double num[][]){
		double sum,ave;
		int i = 0;
		int j = 0;
		sum = 0;
		
		for(;i < num.length;i++){
			for(j = 0;j < num[i].length;j++){
			
				sum = sum + num[i][j];
			}
		}
		
		ave = sum / (i * (j - 1));
		System.out.printf("合計は『%.2f』",sum);
		System.out.printf("平均は『%.2f』",ave);
	}

}
