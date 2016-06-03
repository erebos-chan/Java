package tue_2016_05_17;
import java.util.Scanner;
import java.util.function.BooleanSupplier;

public class AdvancementCondition {

	public static void main(String[] args) {
		
		//変数の宣言
		boolean kanken3,mos,jpass3,jken3;
		
		//スキャナの準備　
		Scanner scan = new Scanner(System.in);
		
		//プロンプト
		System.out.println("各試験の合否を入力してください。(合格→true,不合格→false)");
		
		//ユーザ入力
		System.out.print("漢検3級の合否>>>>>>>");
		kanken3    = scan.nextBoolean();
		
		System.out.print("MOSの合否>>>>>>>>>>>");
		mos        = scan.nextBoolean();
		
		System.out.print("ジョブパス3級の合否>");
		jpass3     = scan.nextBoolean();
		
		System.out.print("J検の合否>>>>>>>>>>>");
		jken3      = scan.nextBoolean();
	
		//メソッド呼び出し
		advancementCondition(kanken3, mos, jpass3, jken3);
		
	

	}
	
	static void advancementCondition(boolean kanken3,boolean mos,boolean jpass3,boolean jken3){
		
		if(kanken3 & mos & jpass3 & jken3){
			System.out.println("【進級可能】");
		}else{
			System.out.println("【進級不可】");
			}
		}
		
		
	}

	

