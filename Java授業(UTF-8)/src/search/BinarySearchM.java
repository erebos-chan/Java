package search;

import java.util.Scanner;

public class BinarySearchM {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("入力する要素の数を入力>>");
		int n = scan.nextInt();

		int[] t = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + "番の要素を入力>>");
			t[i] = scan.nextInt();

		}

		System.out.print("探索したい値を入力>>");
		int data = scan.nextInt();

		int idx = binarySearch(t, n, data);
		System.out.println();

		if(idx == -1){
			System.out.println("入力した値は配列内に存在しません。");
		}else{
			
			System.out.println("先頭から" + (idx + 1) + "番目");
		}
		
		scan.close();
		
		

	}

	static int binarySearch(int[] t, int n, int data) {
		int idx = -1;
		int low = 0;
		int high = n;
		int k = 0;

		for (; (low <= high) & (idx == -1);k++) {
			int mid = (low + high) / 2;
			if (data == t[mid]) {
				idx = mid;
			} else {
				if (data > t[mid]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}
		System.out.println(k);
		

		return idx;
	}

}
