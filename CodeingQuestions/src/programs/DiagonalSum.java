package programs;

/**
 * 
 * @author Aneesh.Mathai
 */
public class DiagonalSum {

	public static void main(String[] args) {

		int[][] twoD = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0, n = twoD.length - 1; i < twoD.length && n >= 0; i++, n--) {
			for (int j = 0, m = twoD.length - 1; j < twoD.length && m >= 0; j++, m--) {
				if (i == j) {
					sum += twoD[i][j];
				}
				if (m == n) {
					sum += twoD[n][m];
				}
			}
		}

		System.out.println(sum);

	}

}
