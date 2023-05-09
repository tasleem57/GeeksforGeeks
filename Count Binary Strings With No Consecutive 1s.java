class Solution {
    int mod = 1000000007;
    
    public int countStrings(long N) {
        long[][] matrix = {{1, 1}, {1, 0}};
        matrix = matrixExponentiation(matrix, N);
        return (int)((matrix[0][0] + matrix[0][1]) % mod);
    }
    
    public long[][] matrixMultiplication(long[][] a, long[][] b) {
        long[][] matrix = new long[2][2];
        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                long count = 0;
                for(int k=0; k<2; k++) {
                    count = (count + (a[i][k] * b[k][j]) % mod) % mod;
                }
                matrix[i][j] = count % mod;
            }
        }
        return matrix;
    }
    
    public long[][] matrixExponentiation(long[][] v, long n) {
        if(n == 1) {
            return v;
        }
        long[][] temp = matrixExponentiation(v, n/2);
        long[][] ans = matrixMultiplication(temp, temp);
        if(n % 2 == 1) {
            ans = matrixMultiplication(ans, v);
        }
        return ans;
    }
}
