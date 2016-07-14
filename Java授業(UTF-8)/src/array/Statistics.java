package array;

public class Statistics {

	public static void main(String[] args) {

		double[] num = { 23.0, 48.3, 15.6, 100.43, 90.273};

		statistics(num);
	}

	static void statistics(double[] num) {
		double sum = 0.0;
		double ave = 0.0;
		int i = 0;
		System.out.println(num.length);
		while(i != num.length){
			sum += num[i];
			i++;
		}
		ave = sum / i;

		System.out.printf("合計『%.2f』", sum);
		System.out.println();
		System.out.printf("平均『%.02f』", ave);

	}

}
