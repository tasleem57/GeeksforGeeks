class Solution {
    public static String stringMirror(String str) {
        // code here
int i=1;
        char prev=str.charAt(0);
        String smallest="";
        smallest+=prev;
        smallest+=prev;
        if(str.length()>1 && str.charAt(1)==prev){
            return smallest;
        }
        for(;i<str.length();i++){
            if((int)str.charAt(i)>(int)prev){
                break;
            }
            prev=str.charAt(i);
        }
        smallest=str.substring(0,i);
        i--;
        smallest+=reverse(str,i);
        return smallest;
        
    }
    public static String reverse(String str, int i){
        String rt="";
        for(;i>=0;i--){
            rt+=str.charAt(i);
        }
        return rt;
    }
}
        
