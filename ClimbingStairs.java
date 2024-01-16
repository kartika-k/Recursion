class Solution {
    public int climbStairs(int n) {
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        int totalWays = climbStairs(n-1) + climbStairs(n-2);
        return totalWays;
    }
}
//TC - O(2^n) 
//SC - O(n)
