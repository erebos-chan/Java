package tue_2016_05_17;
import java.util.Scanner;

public class DecideWinner {

	public static void main(String[] args) {
		 
		//�X�L���i�̏���
		Scanner scan = new Scanner(System.in);
		
		//�ϐ��̐錾
		int playerHand,enemyHand;
		
		//���[�U����
		System.out.println("����񂯂�̏��s�𔻒肵�܂��B(�O�[��0,�`���L��1,�p�[��2)");
		System.out.print("�����̏o���������͂��Ă��������B>>");
		playerHand = scan.nextInt();
		System.out.print("����̏o���������͂��Ă��������B>>");
		enemyHand  = scan.nextInt();
		
		//���\�b�h�̌Ăяo��
		dicideWinner(playerHand,enemyHand);
		
		

	}
	
	static void dicideWinner(int playerHand,int enemyHand){
		if( (playerHand == 0 & enemyHand == 1)|
		  (playerHand == 1 & enemyHand == 2)|
		  (playerHand == 2 & enemyHand == 0)) {
			System.out.println("�y�����̏����z");
		}else{
			if(playerHand == enemyHand){
				System.out.println("�y�������z");
			}else{
				System.out.println("�y����̏����z");
				
			}
		}
		
	}

}
