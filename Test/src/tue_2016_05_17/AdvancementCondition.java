package tue_2016_05_17;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class AdvancementCondition {

	public static void main(String[] args) {
		
		//�ϐ��̐錾
		boolean kanken3,mos,jpass3,jken3;
		
		//�X�L���i�̏����@
		Scanner scan = new Scanner(System.in);
		
		//�v�����v�g
		System.out.println("�e�����̍��ۂ���͂��Ă��������B(���i��true,�s���i��false)");
		
		//���[�U����
		System.out.print("����3���̍���>>>>>>>");
		kanken3    = scan.nextBoolean();
		
		System.out.print("MOS�̍���>>>>>>>>>>>");
		mos        = scan.nextBoolean();
		
		System.out.print("�W���u�p�X3���̍���>");
		jpass3     = scan.nextBoolean();
		
		System.out.print("J���̍���>>>>>>>>>>>");
		jken3      = scan.nextBoolean();
	
		//���\�b�h�Ăяo��
		advancementCondition(kanken3, mos, jpass3, jken3);
		
	

	}
	
	static void advancementCondition(boolean kanken3,boolean mos,boolean jpass3,boolean jken3){
		
		if(kanken3 & mos & jpass3 & jken3){
			System.out.println("�y�i���\�z");
		}else{
			System.out.println("�y�i���s�z");
			}
		}
		
		
	}

	

