package old;
import java.util.Scanner;

public class mondai {

	public static void main(String[] args) {
		//�ϐ�
		int price;
		int number;
		int total;
		
		//���[�U���͏���
		Scanner scan = new Scanner(System.in);
		
		//���[�U����
		System.out.print("��񂲂̌������>");
		number = scan.nextInt();
		
		//�v�Z
		price = 100;
		total = price * number;
		
		//�\��
		System.out.printf("�w�����z��%d�~�ł��B",total);
			

	}

}
