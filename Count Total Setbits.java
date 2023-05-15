class Solution {
    public static long countBits(long N) {
        // code here
       long count =0;
       for(int i=1;i<=N;i++){
           count += Integer.bitCount(i);
       }
       return count;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long n =sc.nextInt();
            System.out.println(countBits(n));
        }
    }
}
