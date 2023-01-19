//974. Subarray Sums Divisible by K
/*
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
   A subarray is a contiguous part of an array.
 */




import java.util.*;

public class Jan19 {
     //daily challenge jan 19
     public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        int sum=0;
        int r=0;//remainder
            HashMap<Integer,Integer> map=new HashMap<>();
            map.put(0,1);
            //map will store the remainders and their freq
            for(int i=0;i<nums.length;i++){
    
    
                sum+=nums[i];
                r=sum%k;
                //case of negative remainder
                if(r<0){
                    //add k to it
                    r+=k;
                }
                //now add the remainder and their freq to the map
             if(map.containsKey(r)){
                 //add prev freq to ans and update its new freq in map
                 ans+=map.get(r);//this gives us value corresponding to key r
                 //update freq in map
                 map.put(r,map.get(r)+1);
             }else{
                 //if it isnt present in map
                 map.put(r,1);//putting it for first time
             }
            }
            return ans;
        }
}
