package conversion;

import java.util.Scanner;

public class NumberTruncation {

	public static void main(String[] args) {
		// �X�L���i�̏���
		Scanner scan = new Scanner(System.in);

		// �ϐ��̐錾
		int number;

		// �v�����v�g
		System.out.println("���͂���������1�̈ʂ�؂�̂Ăĕ\�����܂��B");

		// ���[�U����
		System.out.print("���������>>");
		number = scan.nextInt();

		// ���\�b�h�Ăяo��
		numberTruncation(number);

		// �X�L���iclose
		scan.close();

	}

	static void numberTruncation(int number) {
		// �ϐ��̐錾
		int truncated;

		// �ϊ�
		truncated = number - number % 10;

		// �\��
		System.out.printf("�؎̂Č�̐��l�́w%d�x�ł��B", truncated);

	}
}