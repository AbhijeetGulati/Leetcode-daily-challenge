//72 Edit Distance
/*
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
 
 */
public class Feb26 {//dynamic programming on strings
    //using memoization 
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        //dp of size n*m
            int[][] dp=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    dp[i][j]=-1;
                }
            }
            return helperSt(n-1,m-1,word1,word2,dp);
    
        }
    //helper function
    public int helperSt(int i, int j, String word1, String word2, int[][] dp){
        //base case
        if(i<0){
            //word1 is exhausted
            return j+1;
        }
        if(j<0){
            //word2 is exhausted
            return i+1;
        }
        //base case done
        if(dp[i][j]!=-1){
            //subproblem already solved
            return dp[i][j];
        }
        //2 cases
        //string matching
        if(word1.charAt(i)==word2.charAt(j)){
            //continue
           return dp[i][j]=helperSt(i-1,j-1,word1,word2,dp);
        }
        else{
            //when not matching
            return dp[i][j]=1+ Math.min(helperSt(i-1,j,word1,word2,dp),Math.min(helperSt(i,j-1,word1,word2,dp), helperSt(i-1,j-1,word1,word2,dp)));
        }
    }
    
}
