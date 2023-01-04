//2244. Minimum Rounds to Complete All Tasks

/*
 * You are given a 0-indexed integer array tasks, where tasks[i] represents the difficulty level of a task.
 *  In each round, you can complete either 2 or 3 tasks of the same difficulty level.

Return the minimum rounds required to complete all the tasks, or -1 if it is not possible to complete all the tasks.
 */
import java.util.*;

 class Solution {
    //daily challenge jan 4
     public int minimumRounds(int[] tasks) {
     //step 1 store freq of each task and its difficulty in a map
         HashMap<Integer,Integer> map=new HashMap<>();
         int ans=0;
         //traverse tasks array
         for(int i:tasks){
             map.put(i,map.getOrDefault(i,0)+1);//storing tasks and their freq
         }
         int cnt=0;
         for(int c:map.values()){
             //using map.values() we can iterate through all the values in the hashmap
             if(c<2){
                 return -1;
             }
             if(c==2 || c==3){
                 ans++;
             }
             if(c>3){
                 //ceil value
                  ans+= (int) Math.ceil((double)c/3.0);
                 //return ans;
             }
         }
         return ans;
     }
 }