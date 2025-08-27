import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length()<ransomNote.length())
        return false;
        Map<Character,Integer> freq=new HashMap<>();
         for(int i=0;i<magazine.length();i++)
        freq.put(magazine.charAt(i),freq.getOrDefault(magazine.charAt(i),0)+1);
        for(int j=0;j<ransomNote.length();j++)
        {
            if(!freq.containsKey(ransomNote.charAt(j)) || freq.get(ransomNote.charAt(j))<=0)
                return false;
            else
                freq.put(ransomNote.charAt((j)),freq.get(ransomNote.charAt(j))-1);
        }
        return true;
    }
}