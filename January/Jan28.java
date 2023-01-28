//352. Data Stream as Disjoint Intervals
/*
 * Given a data stream input of non-negative integers a1, a2, ..., an, 
 * summarize the numbers seen so far as a list of disjoint intervals.

Implement the SummaryRanges class:

SummaryRanges() Initializes the object with an empty stream.
void addNum(int value) Adds the integer value to the stream.
int[][] getIntervals() Returns a summary of the integers in the stream currently as a 
list of disjoint intervals [starti, endi]. The answer should be sorted by starti.
 */



import java.util.*;

class SummaryRanges {
    HashSet<Integer> set=new HashSet<>();
        public SummaryRanges() {
        set.clear();
        }

        public void addNum(int value) {
        set.add(value);
        }

        public int[][] getIntervals() {
    //here we will have to sort the values into intervals
            ArrayList<Integer> list=new ArrayList<>();
            //now put all the values from set into the list
            for(int i:set){
                list.add(i);//transferring all values from set to list
            }
            //now sort the list
            Collections.sort(list);
            List<int[]> intervals=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                int left=list.get(i);
                while(i<list.size()-1 && list.get(i)+1==list.get(i+1)){
                    //when the element at next index is a consecutive element
                    i++;
                }
            //now add the left and right values to an int array to form an interval
                intervals.add(new int[]{left,list.get(i)});
            }
            return intervals.toArray(new int[0][]);//converting the 2d arraylist to a 2d array
        }
    }