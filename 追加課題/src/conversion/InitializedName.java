package conversion;
import java.util.Scanner;

public class InitializedName {

	public static void main(String[] args) {
		//�X�L���i�̏���
		Scanner scan = new Scanner(System.in);
		
		//�ϐ��̏���
		String familyName,firstName;
		
		//�v�����v�g
		System.out.println("���O�̃C�j�V������\�����܂��B");
		
		//���[�U����
		System.out.print("�������(���[�}��)>>");
		familyName = scan.next();
		
		System.out.print("�������(���[�}��)>>");
		firstName = scan.next();
		
		//���\�b�h�Ăяo��
		initializedName(familyName,firstName);
		
		//�X�L���iClose
		scan.close();

	}
	
	static void initializedName(String familyName,String firstName){
		
	}

}
