package conversion;
import java.util.Scanner;

public class NameConcatenation {

	public static void main(String[] args) {
		
		//�X�L���i�̏���
			Scanner scan = new Scanner(System.in);
		
		//�ϐ��̐錾	
			String familyName,firstName;
		
		//���[�U����
			System.out.print("������͂��Ă��������B>>");
				familyName = scan.next();
			
			System.out.print("������͂��Ă��������B>>");
				firstName  = scan.next();
			
		
		//���\�b�h�Ăяo��
			nameConcatenation(familyName,firstName);
			
		//�X�L���iclose
			scan.close();
			

	}

	static void nameConcatenation(String familyName,String firstName){
		System.out.println("���Ȃ��̖��O�́y" + familyName + firstName + "�z�ł��B");
	}
}
