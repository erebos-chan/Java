package calculation;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		//�X�L���i�̏���
		Scanner scan = new Scanner(System.in);
		
		//�ϐ��̐錾
		int dividend,divisor;
		
		//�v�����v�g
		System.out.println("����Z�̌v�Z���s���܂��B");
		
		//���[�U����
		System.out.print("�����鐔�����>>");
		dividend = scan.nextInt();
		
		System.out.print("���鐔�����>>");
		divisor = scan.nextInt();
		
		//���\�b�h�Ăяo��
		division(dividend,divisor);
		
		//�X�L���iClose
		scan.close();

	}
	static void division(int dividend,int divisor){
		
	}

}
