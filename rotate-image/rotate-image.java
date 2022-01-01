class Solution {
    public void rotate(int[][] matrix) {
        int i=0,j=0;
        int m= matrix.length;
        int n=matrix[0].length;
        for( i=0;i<m;i++){
            for( j=i;j<n;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= tmp;
                
            }
        }
        for( i=0;i<m;i++){
            for( j=0;j<n/2;j++){
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]= tmp;
                
            }
        }
    }
}