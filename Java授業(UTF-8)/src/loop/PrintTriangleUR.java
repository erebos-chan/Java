package loop;

public class PrintTriangleUR {

	public static void main(String[] args) {
		
		
		printTriangle();
		

	}
	static void printTriangle(){
		
		for (int i = 3; i >= 0; i--) {
			for(int k = 3 - i;k > 0;k--){
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				

			}
			System.out.println();
	}

}
}