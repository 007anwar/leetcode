package top.one.fifty.productofarrayexceptself;

class Solution {
    public static void main(String[] args) {
        int[] ints = new Solution().productExceptSelf(new int[]{1, 2, 3, 4});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int j=1;j<nums.length;j++)
            left[j]=left[j-1]*nums[j-1];
        for(int k=n-2;k>=0;k--)
        {
            right[k]=right[k+1]*nums[k+1];
            right[k+1]=right[k+1]*left[k+1];
        }
        return right;
    }
}