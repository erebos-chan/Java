package calculation;

import java.util.Scanner;

public class BMICalculation {

	public static void main(String[] args) {
		// �X�L���i�̏���
		Scanner scan = new Scanner(System.in);

		// �ϐ��̐錾
		double weight, height;

		// �v�����v�g
		System.out.println("BMI�̌v�Z�����܂��B");

		// ���[�U����
		System.out.print("�̏d�����>>");
		weight = scan.nextDouble();

		System.out.print("�g�������>>");
		height = scan.nextDouble();

		// ���\�b�h�Ăяo��
		bmiCalculation(weight, height);

		// �X�L���iClose
		scan.close();

	}

	static void bmiCalculation(double weight, double height) {
		// �ϐ��̐錾
		double bmi;

		// �v�Z
		bmi = weight / (height * height) * 10000;

		// �\��
		System.out.printf("���Ȃ���BMI�́w%.1f�x�ł��B", bmi);
	}

}
