package loop;

public class PrintTriangleUL {

	public static void main(String[] args) {
		
		
		printTriangle();
		

	}
	static void printTriangle(){
		
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("*");

			}
			System.out.println();
	}

}
}