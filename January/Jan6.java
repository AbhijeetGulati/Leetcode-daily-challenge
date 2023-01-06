import java.util.Arrays;

/*Maximum Ice Cream Bars
 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n, 
where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, 
and he wants to buy as many ice cream bars as possible. 

Return the maximum number of ice cream bars the boy can buy with coins coins.

Note: The boy can buy the ice cream bars in any order.

 
 */
public class Jan6 {
    
        //daily challenge jan 6
        /* WAY 1:USING DP
         public int maxIceCream(int[] costs, int coins) {
             //callloing our function f
             int n=costs.length;
             int[] dp=new int[n+1];
             Arrays.fill(dp,-1);
             return f(n-1,coins,costs,dp);
         }
         public int f(int ind,int target,int[] costs,int[] dp){
             //base case
             if(ind==0){
                 return costs[0]<=target?1:0;
             }
             
             if(dp[ind]!=-1){
                 return dp[ind];//if there are overlapping subproblems
             }
             //p and np
             int np=f(ind-1,target,costs,dp);
             int p=0;
             if(costs[ind]<=target){
                 //only then we can pick
                 p=1+f(ind-1,target-costs[ind],costs,dp);
             }
             return dp[ind]=Math.max(p,np);
         }
         */
        //way 2 using greedy approach
         //daily challenge jan 6
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int cnt=0;
        for(int i=0;i<costs.length;i++){
            if(costs[i]>coins){
                //we cant buy
                break;
            }else{
             coins-=costs[i];
             cnt++;
            }
        }
        return cnt;
     }
     
}
