//Spiral Matrix
//Given an m x n matrix, return all elements of the matrix in spiral order.



package May;
import java.util.*;
public class May9 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        //m * n matrix
        int m = matrix.length;
        int n = matrix[0].length;
        //take 4 variables for the positioning
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        while (top <= bottom && left <= right) {
            //printing first strip that is from right to left
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            //shift top
            top++;
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;//shifting right
            //check if single row is to be printed only that is we have a 1d array
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                //shift bottom
                bottom--;
            }
            if(left<=right) {//in case only single column is there this code wont execute
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
