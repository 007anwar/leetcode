package top.one.fifty.removeduplicate;

class Solution {
    public static void main(String[] args) {
        new Solution().removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3});
    }
    public int removeDuplicates(int[] nums) {
        int i=0,min=0,length=nums.length;
        while(i+2<length)
        {
            if(nums[i]==nums[i+1] && nums[i+1]==nums[i+2]) {
                min++;
                for (int j = i + 2; j < length - 1; j++)
                    nums[j] = nums[j + 1];
                length--;
            }else{
            i++;
            }
        }
        return (nums.length-min);
    }
}