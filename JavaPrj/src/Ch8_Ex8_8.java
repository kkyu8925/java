
public class Ch8_Ex8_8 {

	public static void main(String[] args) {
		int[][] aa = new int[3][4];
		int i, k;
		int val = 1;

		for (i = 0; i < 3; i++) {
			for (k = 0; k < 4; k++) {
				aa[i][k] = val;
				val++;
			}
		}

		System.out.printf("aa[0][0]부터 aa[2][3]까지 출력 \n");

		for (i = 0; i < 3; i++) {
			for (k = 0; k < 4; k++) {
				System.out.printf("%3d", aa[i][k]);
			}
			System.out.println("\n");
		}
	}
}
