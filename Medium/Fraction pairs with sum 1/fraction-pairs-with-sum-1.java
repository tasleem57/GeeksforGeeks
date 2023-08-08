//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int[] numerator = IntArray.input(br, n);
            
            
            int[] denominator = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.countFractions(n, numerator, denominator);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    static class Fraction{
        private int numerator;
        private int denominator;
        private int hashCode;
        public Fraction(int numerator,int denominator){
            this.numerator = numerator;
            this.denominator = denominator;
            this.hashCode = Objects.hash(numerator,denominator); 
        }
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Fraction that = (Fraction) o;
            return numerator == that.numerator && denominator == that.denominator;
        }

        @Override
        public int hashCode() {
            return this.hashCode;
        }
    }
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        Map<Fraction,Integer> seen = new HashMap<>();
        int countOfFractionsWhoseSumToOne = 0;
        for(int i = 0; i < n; i++){
            int x = numerator[i],y = denominator[i];
            int gcd = findGCD(x,y);
            x/=gcd;
            y/=gcd;
            Fraction curr = new Fraction(x,y);
            Fraction required = new Fraction(y-x,y);
            countOfFractionsWhoseSumToOne+=seen.getOrDefault(required,0);
            seen.put(curr,seen.getOrDefault(curr,0)+1);
        }
        return countOfFractionsWhoseSumToOne;
    }
    private static int findGCD(int a,int b){
        if(b == 0){
            return a;
        }
        else{
            return findGCD(b,a%b);
        }
    }
}
       