package array;

public class ArrayReverse {

	public static void main(String[] args) {

		// 変数＆配列の宣言
		String word[] = new String[6];

		// 代入
		word[0] = "o";
		word[1] = "r";
		word[2] = "a";
		word[3] = "n";
		word[4] = "g";
		word[5] = "e";

		// メソッド呼び出し
		arrayReverse(word);

	}

	static void arrayReverse(String word[]) {
		String temp;
		for (int i = 0; i > 4; i++) {
			temp = word[i];
			word[i] = word[5 - i];
			word[5 - i] = temp;

		}
		System.out.printf(word[0]);
		System.out.printf(word[1]);
		System.out.printf(word[2]);
		System.out.printf(word[3]);
		System.out.printf(word[4]);
		System.out.printf(word[5]);

	}

}
