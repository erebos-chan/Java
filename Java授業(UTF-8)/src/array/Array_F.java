package array;

public class Array_F {

	public static void main(String[] args) {

		String alph[][] = { 
				{ "　", "●", "●", "●", "　" },
				{ "　", "●", "　", "　", "　" },
				{ "　", "●", "●", "●", "　" },
				{ "　", "●", "　", "　", "　" },
				{ "　", "●", "　", "　", "　" }, 
				};
	
		
		String temp;

		for (int i = 0; i < 5; i++) {
			int j = 0;
			int k = 4;
			for (; j < k; j++) {
				temp = alph[i][j];
				alph[i][j] = alph[i][k];
				alph[i][k] = temp;
				k = k - 1;
			}
		}
		

			for (int l = 0; l < 5; l++) {
				for (int m = 0; m < 4; m++) {
					System.out.print(alph[l][m]);
				}
				System.out.println();
			}
			System.out.println();

			}

		}
	



	
