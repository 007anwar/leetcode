package top.one.fifty.poweroftwo;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        new Solution().isPowerOfTwo(130);
    }
    public boolean isPowerOfTwo(int n) {
        return divideByTwo(n);
    }
    private boolean divideByTwo(int n)
    {
        Set<Integer> twoPower=new HashSet();
        twoPower.add(1);
        twoPower.add(2);
        twoPower.add(4);
        twoPower.add(8);
        twoPower.add(16);
        twoPower.add(32);
        twoPower.add(64);
        twoPower.add(128);
        if(twoPower.contains(n))
        return true;
        else if(n<129 || n%2!=0)
        return false;
        n=n/2;
        return divideByTwo(n);
    }
}