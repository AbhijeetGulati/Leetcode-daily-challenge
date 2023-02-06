

//1470 Shuffle the array
/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/

import java.util.*;
public class Feb6 {
    public int[] shuffle(int[] nums, int n) {
        //2*n=nums.length
    ArrayList<Integer> ans=new ArrayList<>();
    int i=0;
    while(i<n){
        ans.add(nums[i]);
        ans.add(nums[n+i]);
        i++;
    }
    int[] arr=new int[nums.length];
    for(int j=0;j<ans.size();j++){
        arr[j]=ans.get(j);
    }
    return arr;
    }
}
