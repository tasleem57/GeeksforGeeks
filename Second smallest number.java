class Solution{
    static String secondSmallest(int S, int D){
        // code here
        int curr=S ;
        String ans = "";
        curr--;  //reserving 1;
        for(int i=0;i<D;i++){
            ans=String.valueOf(Math.min(9,curr))+ans;
            curr-=Math.min(9,curr);
            if(i==D-2){  //next calculating most significant digit so using reserve
                curr++;
            }
        }
        //smallest number calculated
        char [] ans1 = ans.toCharArray();
        int i;
        for(i=D-1;i>0;i--){
            if(ans1[i]!='0' && ans1[i-1]<'9'){
                ans1[i]--;
                ans1[i-1]++;
                break;
            }
        }
        if(i==0)return "-1";
        return new String(ans1);
    }
}
