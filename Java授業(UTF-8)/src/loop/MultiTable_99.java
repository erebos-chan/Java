package loop;


public class MultiTable_99 {

	public static void main(String[] args) {
		
		System.out.println("九九表を表示します。");
		System.out.println();
		
		multiTable();


	}
	static void multiTable(){
		for(int i = 1; i < 100; i ++){
			System.out.print(i + "の段: ");
			for(int j = 1; j < 100; j ++){
				System.out.printf("%5d ",i * j );
				
			}
			System.out.println();
		}
	}

}
