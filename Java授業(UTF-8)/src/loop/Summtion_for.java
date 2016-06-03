package loop;

public class Summtion_for {

	public static void main(String[] args) {
		
		summtion();
		
	}
	static void summtion(){
		
		int i,sum;
		
		for(i = 0,sum = 0;i < 11;i++){
			sum = sum + i;
		}
		System.out.printf("合計は『%d』です。",sum);
	}

}
