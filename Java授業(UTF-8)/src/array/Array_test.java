package array;

public class Array_test {

	public static void main(String[] args) {
		int test[][] = new int[4][4];
		

		test[0][0] = 100;
		test[0][1] = 100;
		test[0][2] = 100;
		test[1][0] = 70;
		test[1][1] = 50;
		test[1][2] = 30;
		test[2][0] = 60;
		test[2][1] = 40;
		test[2][2] = 20;
		test[3][0] = 90;
		test[3][1] = 80;
		test[3][2] = 70;
		
		for(int i =0; i < 4 ; i++ ){
			int sum = 0;
			int k = 0;
			for(; k < 3 ; k++){
				sum = sum + test[i][k];	
				
			}
			
			test[i][3] =sum / 3;
			
		}
		System.out.println(test[0][3]);
		System.out.println(test[1][3]);
		System.out.println(test[2][3]);
		System.out.println(test[3][3]);

	}

}
