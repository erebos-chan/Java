package Fri_2016_05_13;
import java.util.Scanner;


public class add_method {

	public static void main(String[] args) {
	
		//�ϐ��̐錾
		int num1,num2,sum;
		
		//Scanner�̏���
		Scanner scan = new Scanner(System.in);
		
		//���[�U����
		System.out.print("1�߂̐�������͂��Ă��������B>>");
		num1 = scan.nextInt();
		
		System.out.print("2�߂̐�������͂��Ă��������B>>");
		num2 = scan.nextInt();
		
		//���\�b�h�Ăяo��
		sum = add(num1,num2)
;
		//�\��
		System.out.printf("���Z�̌��ʂ́A %d �ł��B",sum);}
	

	
	static int add (int addend1,int addend2){
		int sum;
		sum = addend1 + addend2;
		return sum;
	}

}