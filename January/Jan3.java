//944. Delete Columns to Make Sorted
/*
 * You are given an array of n strings strs, all of the same length.

The strings can be arranged such that there is one on each line, making a grid. For example, 
strs = ["abc", "bce", "cae"] can be arranged as:

abc
bce
cae
You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed),
 columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

Return the number of columns that you will delete.

 
 */
public class Jan3 {
  //daily challenge
  public int minDeletionSize(String[] strs) {
    // boolean flag=true;
    int n=strs.length;//n is number of rows
    int m=strs[0].length();//m is number of columns

     int cnt=0;
     //travel all columns

 for(int col=0;col<m;col++){
     for(int row=1;row<n;row++){
         char c=strs[row-1].charAt(col);
         char d=strs[row].charAt(col);
         if(d<c){
             
             cnt++;
             break;
         }
     }
     
 }//end of i loop
    return cnt;
}  
}
