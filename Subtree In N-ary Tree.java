class Solution{
    public static String dfstravel(Node root,HashMap<String,Integer>mp) {
         String str=Integer.toString(root.data);
         if(root.children.size()==0) {
             if(mp.containsKey(str)) mp.put(str,mp.get(str)+1);
             else mp.put(str,1);
             return str;
         }
         for(Node child:root.children) {
             str=str+"#"+dfstravel(child,mp);
         }
         if(mp.containsKey(str)) mp.put(str,mp.get(str)+1);
         else mp.put(str,1);
         return str;
         
    } 
    public int duplicateSubtreeNaryTree(Node root){
       // Code here
       Integer count=0;
     HashMap<String,Integer>mp=new HashMap<String,Integer>();
     Solution.dfstravel(root,mp);
     for(Integer i:mp.values())  {
         if(i>1)count++;
     }
     return count;
    }
    
}
