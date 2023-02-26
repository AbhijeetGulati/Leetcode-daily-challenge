//1675. Minimize Deviation in Array
/*
 * You are given an array nums of n positive integers.

You can perform two types of operations on any element of the array any number of times:

If the element is even, divide it by 2.
For example, if the array is [1,2,3,4], then you can do this operation on the last element, and the array will be [1,2,3,2].
If the element is odd, multiply it by 2.
For example, if the array is [1,2,3,4], then you can do this operation on the first element, and the array will be [2,2,3,4].
The deviation of the array is the maximum difference between any two elements in the array.

Return the minimum deviation the array can have after performing some number of operations.
 */

import java.util.Collections;
import java.util.PriorityQueue;

public class Feb24 {//using priority queue
    public int minimumDeviation(int[] nums) {
        //multiply all odd elements by 2
            PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());//now we wil get maximum element from the priority queue
            int mini=Integer.MAX_VALUE;
            int diff=Integer.MAX_VALUE;
            for(int i:nums){
                if(i%2!=0){
                    //odd element
                    i=i*2;
                }
                mini=Math.min(mini,i);//we will get the minimum element
                pq.add(i);
                //now add it to priority queue
            }
            //now all elements added to priority queue
            while(pq.peek()%2==0){
                //while popped element is even
                int mx=pq.peek();//storing max element in mx
                //now removing it
                pq.remove(pq.peek());
                diff=Math.min(diff,mx-mini);
                mini=Math.min(mx/2,mini);
                //push mx/2 in pq
                pq.add(mx/2);
                
            }
            return Math.min(diff,pq.peek()-mini);
        }
}
