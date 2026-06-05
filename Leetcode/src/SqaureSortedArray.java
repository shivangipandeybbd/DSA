import java.util.Arrays;

/*
https://leetcode.com/problems/squares-of-a-sorted-array/description/
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
 */
public class SqaureSortedArray {
    public static  int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int left=0,right=nums.length-1,k=nums.length-1;
        while(left<=right)
        {
            int lsd=nums[left]*nums[left];
            int rsd=nums[right]*nums[right];
            if(lsd>rsd)
            {
                arr[k--]=lsd;
                left++;
            }
            else
            {
                arr[k--]=rsd;
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4,-3,0,1,3})));
    }
}
