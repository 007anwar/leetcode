package top.one.fifty.isomorphic;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        new Solution().isIsomorphic("egg","add");
    }
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Character> sTot=new HashMap<>();
        Map<Character,Character> tTos=new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            if(sTot.containsKey(s.charAt(i)) && sTot.get(s.charAt(i))!=t.charAt(i))
                return false;
            else
                sTot.put(s.charAt(i),t.charAt(i));
            if (tTos.containsKey(t.charAt(i)) && tTos.get(t.charAt(i)) != s.charAt(i))
                return false;
            else
                tTos.put(t.charAt(i), s.charAt(i));
        }
        boolean result=true;


        for (Character c : sTot.keySet()) {
            if(tTos.get(sTot.get(c))!=c)
                result=false;
        }
        return result;
    }
}