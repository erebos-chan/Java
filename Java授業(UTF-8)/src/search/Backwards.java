package search;

public class Backwards {

	public static void main(String[] args) {
		
		char[] array = "funabashi".toCharArray();
		

		for(int i = 0;i < array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
		
		backwards(array);
		
	}
	
	static void backwards(char[] array){
		int i = 0;
		int j = array.length - 1;
		char temp;
		
		for(; i < j; ){
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
			}
		
		for(int k = 0;k < array.length;k++){
			System.out.print(array[k]);
		}
				
		}
	}


