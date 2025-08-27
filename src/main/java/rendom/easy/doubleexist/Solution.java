package rendom.easy.doubleexist;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> numbers=new HashSet<>();
        for(int num:arr)
        {
            if(numbers.contains(num*2) || (num%2==0&& numbers.contains(num/2)))
                return true;
            numbers.add(num);
        }
        return false;
    }
}