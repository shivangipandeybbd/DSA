import java.util.Arrays;
/*Segregate 0s and 1s
https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
Difficulty: EasyAccuracy: 54.25%Submissions: 166K+Points: 2Average Time: 15m
Given an array arr[] consisting of only 0's and 1's. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.

Examples :

Input: arr[] = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
*/
public class Segregate0And1 {
        static int[] segregate0and1(int[] arr) {
            int left=0,right=arr.length-1;
            while(left<=right)
            {
                if(arr[left]==1 && arr[right]==0)
                {
                    arr[left]=0;
                    arr[right]=1;
                }
                if(arr[left]==0)
                    left++;
                if(arr[right]==1)
                    right--;


            }
            return arr;
        }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(segregate0and1(new int[]{1, 0, 0, 1, 1, 0, 0, 0, 1})));
    }

}
