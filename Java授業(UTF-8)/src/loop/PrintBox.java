package loop;

public class PrintBox {

	public static void main(String[] args) {
		
		printBox();

	}
	static void printBox(){
		for(int i = 1;i < 4;i++){
			for(int j = 1; j< 4;j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
