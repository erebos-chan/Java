package old;
import java.util.Scanner;

public class InteriorAngles {

	public static void main(String[] args) {
	
		//�錾
		int angle1;
		int angle2;
		int angle3;
		
		//���[�U���͏���
		Scanner scan = new Scanner(System.in);
		
		//����
		System.out.println("�O�p�`�̓��p�̑傫�������߂܂��B");
		System.out.println("�P�ڂ̓��p�̑傫������͂��Ă��������i����)�B");
		angle1 = scan.nextInt();
		
		System.out.println("2�ڂ̓��p�̑傫������͂��Ă��������i����)�B");
		angle2 = scan.nextInt();
		
		//�v�Z
		angle3 = 180-angle1-angle2;
		
		//�\��
		
		System.out.printf("���p�̑傫�������ꂼ�� %d %d �̏ꍇ�A�c��̓��p�̑傫���́A%d�@�ł��B",angle1,angle2,angle3);
		
		

	}

}
