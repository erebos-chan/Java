package tue_2016_05_17;
import java.util.Scanner;

public class DecideWinnerEquals {

	public static void main(String[] args) {
		
		//�X�L���i�̏���
			Scanner scan = new Scanner(System.in);
				
		//�ϐ��̐錾
			String playerHand,enemyHand;
			
		//���[�U����
			System.out.println("����񂯂�̏��s�𔻒肵�܂��B(�O�[:�`���L:�p�[)");
			
			System.out.print("�����̏o���������͂��Ă��������B>>");
			playerHand = scan.next();
			
			System.out.print("����̏o���������͂��Ă��������B>>");
			enemyHand  = scan.next();
			
			
		//���\�b�h�̌Ăяo��
			dicideWinner(playerHand,enemyHand);
	}

	static void dicideWinner(String playerHand,String enemyHand){
		if( (playerHand.equals("�O�[") & enemyHand.equals("�`���L"))|
		  (playerHand.equals("�`���L") & playerHand.equals("�p�["))|
		  (playerHand.equals("�p�[")   & enemyHand.equals("�O�["))) {
			System.out.println("�y�����̏����z");
		}else{
			if(playerHand.equals(enemyHand)){
				System.out.println("�y�������z");
			}else{
				System.out.println("�y����̏����z");
			}
		}
		
	}

}
