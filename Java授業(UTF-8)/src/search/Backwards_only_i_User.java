package search;
import java.util.Scanner;

public class Backwards_only_i_User {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("文字列を入力>>");
		String string = scan.next();
		
		
		char[] array = string.toCharArray();
		
		
		outPrint(array);
		
		backwards(array);
		
		scan.close();
	}
	
	static void backwards(char[] array){
		char temp;
		
		for(int i = 0;i < array.length  / 2;i++){
			temp = array[i];
			array[i] = array[array.length - i -1];
			array[array.length - i -1] = temp;
			
			}
		System.out.print("変換後:");
		for(int i = 0;i < array.length - 1;i++){
			System.out.print(array[i]);
			System.out.print(",");
		}
		System.out.print(array[array.length -1]);
				
		}
	static void outPrint(char[] array){
		System.out.print("変換前:");
		for(int i = 0;i < array.length - 1;i++){
			System.out.print(array[i]);
			System.out.print(",");
		}
		System.out.print(array[array.length -1]);
		System.out.println();
		
	}
	}


