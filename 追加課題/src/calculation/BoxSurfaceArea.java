package calculation;
import java.util.Scanner;

public class BoxSurfaceArea {

	public static void main(String[] args) {
		//�X�L���i�̏���
		Scanner scan = new Scanner(System.in);
		
		//�ϐ��̐錾
		int sideLenght;
		
		//�v�����v�g
		System.out.println("�����̂̕\�ʐς����߂܂��B");
		
		//���[�U����
		System.out.print("1�ӂ̒��������>>");
		sideLenght = scan.nextInt();
		
		//���\�b�h�Ăяo��
		boxSurfaceArea(sideLenght);
		
		//�X�L���iClose
		scan.close();

	}
	static void boxSurfaceArea(int sideLenght){
		//�ϐ��̐錾
		int surfaceArea;
		
		//�v�Z
		surfaceArea = sideLenght * sideLenght * 6;
		
		//�\��
		System.out.printf("�����̂̕\�ʐς́w%d�x�ł��B",surfaceArea);
	}
}
