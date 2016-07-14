import java.io.BufferedReader;
		import java.io.InputStreamReader;
		import java.util.Scanner;


public class tesr {

	public static void main(String[] args) {
		
	
		        Scanner scan = new Scanner(System.in);
		        
		        String mozi = scan.next();
		        String[] temp = mozi.split(" ");
		        int i_1 = Integer.parseInt(temp[0]);
		        int i_2 = Integer.parseInt(temp[1]);
		        int i_3 = Integer.parseInt(temp[2]);
		        
		        if((i_1 <= 500)&(i_2 <= 10)&(i_3 <= 500)){
		            System.out.println("OK");
		        }else{
		            System.out.println("NG");
		        }
		    }
		}