package conversion;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// �X�L���i�̏���
		Scanner scan = new Scanner(System.in);

		// �ϐ��̐錾
		double celsius;

		// �v�����v�g
		System.out.println("���x�ϊ����s���܂��B");

		// ���[�U����
		System.out.print("�ێ�(��)�ŉ��x����͂��Ă��������B>>");
		celsius = scan.nextDouble();

		// ���\�b�h�Ăяo��
		celsiusToFahrenheit(celsius);

		// �X�L���iClose
		scan.close();
	}

	static void celsiusToFahrenheit(double celsius) {
		// �ϐ��̐錾
		double fahrenheit, kelvin;

		// �v�Z
		fahrenheit = celsius * 1.8 + 32;
		kelvin = celsius + 273.15;

		// �\��
		System.out.println("�ϊ����ʂ�");
		System.out.printf("�؎��w%.2f�x�x�ł��B", fahrenheit);
		System.out.println();
		System.out.printf("�P���r���w%.2f�x�x�ł��B", kelvin);

	}

}
