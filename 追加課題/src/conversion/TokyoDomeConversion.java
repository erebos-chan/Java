package conversion;

import java.util.Scanner;

public class TokyoDomeConversion {

	public static void main(String[] args) {
		// �X�L���i�̏���
		Scanner scan = new Scanner(System.in);

		// �ϐ��̐錾
		double tdarea, area;

		// �����h�[���̖ʐς̑��
		tdarea = 46755;

		// �v�����v�g
		System.out.println("���͂����ʐς������h�[���������v�Z���܂��B");

		// ���[�U����
		System.out.print("��ׂ����ʐ�(�u)����͂��Ă��������B>>");
		area = scan.nextDouble();

		// ���\�b�h�Ăяo��
		tokyoDomeConversion(tdarea, area);

		// �X�L���i��close
		scan.close();
	}

	static void tokyoDomeConversion(double tdarea, double area) {
		// �ϐ��̐錾
		double equivalent;

		// �v�Z�Ƒ��
		equivalent = area / tdarea;

		// �\��
		System.out.printf("���͂����ʐς͓����h�[�� %.1f ���ł��B", equivalent);

	}

}
