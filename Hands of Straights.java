class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        if(N%groupSize != 0)
            return false;
        Arrays.sort(hand);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i: hand)
        arr.add(i);
        int group = groupSize;
        while(arr.size() !=0)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int i: arr)
            {
                set.add(i);
                if(set.size() >=groupSize)
                    break;
            }
            int temp = arr.get(0);
            if(group == 0)
                group = groupSize;
                while(group!=0)
                {
                    if(!set.contains(temp))
                        return false;
                    group--;
                    arr.remove(Integer.valueOf(temp));
                    temp++;
                    
                }
        }
        return true;
    }
}
