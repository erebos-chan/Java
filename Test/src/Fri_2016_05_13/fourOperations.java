package Fri_2016_05_13;
import java.util.Scanner;

public class fourOperations {

	public static void main(String[] args) {
		//�ϐ��̐錾
		int num1,num2,sum,dif,product,quotient;
		
		//�X�L���i�[�̏���
		Scanner scan = new Scanner(System.in);
		
		//���[�U�[����
		System.out.println("�v�Z�������l����͂��Ă��������B");
		System.out.print("1�߂̐�������͂��Ă��������B>>");
		num1 = scan.nextInt();
		
		System.out.print("2�߂̐�������͂��Ă��������B>>");
		num2 = scan.nextInt();
		
		//���\�b�h�Ăяo��
		sum = add(num1,num2);
		dif = sub(num1,num2);
		product = mult(num1,num2);
		quotient = div(num1,num2);
		
		//�\��
		System.out.printf("���Z�̌��ʂ�%d�ł��B",sum);
		System.out.printf("���Z�̌��ʂ�%d�ł��B",dif);
		System.out.printf("��Z�̌��ʂ�%d�ł��B",product);
		System.out.printf("���Z�̌��ʂ�%d�ł��B",quotient);
		
	}
	
	static int add(int addend1,int addend2){
		int sum;
		sum = addend1 + addend2;
		return sum;
		
		
	}
	
	static int sub(int minuend,int subtrahend){
		int difference;
		difference = minuend - subtrahend;
		return difference;
				
	}
	
	static int mult(int multplicand,int multiplier){
		int product;
		product = multplicand * multiplier;
		return product;
		
	}
	
	static int div(int dividend,int divisor){
		int quotient;
		quotient = dividend / divisor;
		return quotient;
		
	}

}
