package old;
import java.util.Scanner;

public class TaxedPriceCalculation {

	public static void main(String[] args) {
		
		//�錾
		int price;
		double taxedPrice;
		
		//���[�U���͏���
		Scanner scan = new Scanner(System.in);
		
		//����
		System.out.println("�w�����z����͂��Ă��������B>");
		price = scan.nextInt();
	
		//�v�Z
		taxedPrice = price * 1.08;
				
		//�\��
		System.out.printf("�ō����i�́A%.0f �ł��B",taxedPrice);
		

	}

}
