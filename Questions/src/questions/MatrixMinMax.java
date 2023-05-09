package questions;

public class MatrixMinMax {
	
	public static int solution(int[][] matrix) {
		int[] maxrow = new int[matrix.length];
		int[] mincol = new int[matrix[0].length];
		for(int j=0;j<maxrow.length;j++) {
			maxrow[j] = 0;
		}
		for(int i=0;i<mincol.length;i++) {
			mincol[i] = matrix[0][i];
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]<mincol[j]) {
					mincol[j] = matrix[i][j];
				}
				if(matrix[i][j]>maxrow[i]) {
					maxrow[i] = matrix[i][j];
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==maxrow[j]) {
					if(matrix[i][j]==mincol[i]) {
						return matrix[i][j];
					}
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[][] mat1 = new int[3][2];
		mat1[0][0] = 2;
		mat1[0][1] = 2;
		mat1[1][0] = 1;
		mat1[1][1] = 2;
		mat1[2][0] = 3;
		mat1[2][1] = 4;
		int results = solution(mat1);
		
		System.out.println(results);
		
	}

}
