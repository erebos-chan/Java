package wed_2016_05_11;
import java.util.Scanner;

public class FromCelsius {

	public static void main(String[] args) {
		
		//�X�L���i�[�̗p��
				Scanner scan = new Scanner(System.in);
				
				//�ϐ��̐錾
				double celsius,fahrenheit,kelvin;
				
				//�v�����v�g
				System.out.println("���x�ϊ����s���܂��B");
				
				//���[�U����
				System.out.print("�ێ�����͂��Ă��������B>>");
				celsius = scan.nextDouble();
				
				//�v�Z
				fahrenheit = celsius * 1.8 + 32;
				kelvin     = celsius + 273.15;
				
						
						
				System.out.printf("�ێ�%.1f�x�́A�؎�%.1f�ł��B",celsius,fahrenheit);
				System.out.println();
				System.out.printf("�ێ�%.1f�x�́A�P���r��%.1f�ł��B",celsius,kelvin);
	}

}
