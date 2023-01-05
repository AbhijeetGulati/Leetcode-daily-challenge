import java.util.Arrays;

/*452. Minimum Number of Arrows to Burst Balloons
 * There are some spherical balloons taped onto a flat wall that represents the XY-plane. 
 * The balloons are represented as a 2D integer array points where points[i] = [xstart, xend] denotes a balloon whose
 *  horizontal diameter stretches between xstart and xend. You do not know the exact y-coordinates of the balloons.

Arrows can be shot up directly vertically (in the positive y-direction) from different points along the x-axis.
 A balloon with xstart and xend is burst by an arrow shot at x if xstart <= x <= xend. 
 There is no limit to the number of arrows that can be shot. A shot arrow keeps traveling up infinitely, bursting any balloons in its path.

Given the array points, return the minimum number of arrows that must be shot to burst all balloons.
 */



public class Jan5 {
     //daily challenge jan 5
     public int findMinArrowShots(int[][] points) {
        //sort using the points[i][1]
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int x=points[0][1];
        int count=1;//we are using one balloon for first interval after which we will check

        for(int i=1;i<points.length;i++){
            if(x>=points[i][0] && x<=points[i][1]){
                continue;
            }else{
                //update count and update the value of x
                count++;
                x=points[i][1];
            }
        }
        return count;
    }
}
