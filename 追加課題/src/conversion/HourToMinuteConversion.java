package conversion;

import java.util.Scanner;

public class HourToMinuteConversion {

	public static void main(String[] args) {
		// �X�L���i�̏���
		Scanner scan = new Scanner(System.in);

		// �ϐ��̐錾
		int hour;

		// �v�����v�g
		System.out.println("���͂������Ԃ𕪊��Z���܂��B");

		// ���[�U����
		System.out.print("���Z���������Ԃ���́B>>");
		hour = scan.nextInt();

		// ���\�b�h�Ăяo��
		tourToMinuteConversion(hour);
		
		//�X�L���iclose
		scan.close();

	}

	static void tourToMinuteConversion(int hour) {
		// �ϐ��̐錾
		int minute;
		
		// �v�Z
		minute = hour * 60;
		
		// �\��
		System.out.printf("%d ���Ԃ𕪊��Z����� %d ���ł��B",hour,minute);

	}

}
