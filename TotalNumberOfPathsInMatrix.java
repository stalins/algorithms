public class TotalNumberOfPathsInMatrix {

		static int store[][] = new int[3][4];
		static int countPath(int mat[][], int n, int m, int i, int j) {

			int count = 0;
			if (i == n-1 && j == m -1) {
				System.out.println(i + "  " + j);
				return 1;
			}
							
			if (i >= n || j >= m)
				return 0;
			System.out.println(i + "  " + j);

			if (store[i][j] >= 0)
				return store[i][j];
			
			if (mat[i][j] == 1)
				count = countPath(mat, n, m, i+1, j)+countPath(mat, n, m, i, j+1);
			
			store[i][j] = count;
			return count;	
						
		}
		
		public static void main(String args[]) {
			
			int mat[][] = {
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
			};
			
//			int mat[][] = {
//					{1,1},
//					{0,1}
//					
//			};
			
			for(int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++)
				store[i][j] = -1;
			}
			
			int val = countPath(mat, 3,4, 0,0);
			System.out.println(val);
		}
}
