package wed_2016_05_11;
import java.util.Scanner;


public class BMI {

	public static void main(String[] args) {
		
		//�X�L���i�[�̗p��
		Scanner scan = new Scanner(System.in);
		
		//�ϐ��̐錾
		double weight,height,bmi;
		
		//�v�����v�g
		System.out.println("BMI�̌v�Z�����܂��B");
		
		//���[�U����
		System.out.print("�g������͂��Ă��������B>>");
		height = scan.nextDouble();
		
	
		System.out.print("�̏d����͂��Ă��������B>>");
		weight = scan.nextDouble();
		
		//�v�Z
		bmi = weight/height/height*10000;
				
		System.out.printf("���Ȃ���BMI��%.1f�ł��B",bmi);
	
	}

}
