package problem01;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int count = countClap(i);

			if (count == 0) {
				continue;
			}

			System.out.print(i + " ");

			for (int j = 0; j < count; j++) {
				System.out.print("짝");
			}

			System.out.println("");
		}
	}

	public static int countClap(int number) {

		int[][] a = new int[1][2];
		int numb1, numb2;
		
			System.out.print(number + " ");
			
			if(number>=10) {
				numb1 = number/10;
				numb2 = number-numb1*10;
				if((numb1%3)==0) {
					System.out.print("짝");
				}
				if((numb2%3)==0 && numb2>1) {
					System.out.print("짝");
				}
			} else {
				numb1 = number;
				if((numb1%3)==0) {
					System.out.print("짝");
				}
			}
			System.out.println();
			
		
			


		

		return 0;
	}
}