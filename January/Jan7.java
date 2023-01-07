//gas station
/*
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. 
You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the 
circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 */



public class Jan7 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totgas=0;
        int totcost=0;
        int currgas=0;
        int start=0;
        
        for(int i=0;i<gas.length;i++){
            totgas+=gas[i];
            totcost+=cost[i];
            currgas=currgas+gas[i]-cost[i];
            if(currgas<0){
                //move to next index
                start=i+1;
                currgas=0;//resetting value of currgas
            }
            
        }
        if(totgas<totcost){
            start=-1;
        }
        return start;
         }
}
