package array;

public class FindMinMax {

	public static void main(String[] args) {
		//変数と配列の宣言
		
		int[] num = {20,35,2,78,5};
		int[] minMax = new int[2];
		//メソッド呼び出し
		minMax = findMax(num);
		//出力
		System.out.printf("最小値は『%d』",minMax[0]);
		System.out.printf("最大値は『%d』",minMax[1]);
		

	}
	static int[] findMax(int num[]){
		int[] minMax = new int[2];
		minMax[0] = num[0];
		minMax[1] = num[0];
		
		for(int i = 0;i < num.length;i++){
			if(minMax[1] < num[i]){
				minMax[1] = num[i];
			}
			if(minMax[0] > num[i]){
				minMax[0] = num[i];
			}
		}
		
		return minMax;
	}

}
