package conversion;

import java.util.Scanner;

public class CharacterAt {

	public static void main(String[] args) {
		// �X�L���i�̏���
		Scanner scan = new Scanner(System.in);

		// �ϐ��̐錾
		String str;
		int position;

		// �v�����v�g
		System.out.println("���͂���������̒��̎w�肵���ꏊ�̕����𔲂��o���܂��B");

		// ���[�U����
		System.out.print("����������>>");
		str = scan.next();
		System.out.print("�����o�������̈ʒu�����>>");
		position = scan.nextInt();

		// ���\�b�h�Ăяo��
		characterAt(str, position);

		// �X�L���iClose
		scan.close();
	}

	static void characterAt(String str, int position) {
		// �ϐ��̐錾
		char c;

		// �����o��
		c = str.charAt(position - 1);

		// �\��
		System.out.println("�w�肵�������́w" + c + "�x�ł��B");
	}

}
