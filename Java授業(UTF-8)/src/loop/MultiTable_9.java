package loop;


public class MultiTable_9 {

	public static void main(String[] args) {
		
		
		multiTable();


	}
	static void multiTable(){
		for(int i = 1; i < 10; i ++){
			System.out.print(i + "の段: ");
			for(int j = 1; j < 10; j ++){
				System.out.printf("%2d ",i * j );
				
			}
			System.out.println();
		}
	}

}
