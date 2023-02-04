/*
 //567 Permutation in String
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
 */


package February;

import java.util.*;

public class Feb4 {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
    if(n>m){
        return false;
    }
    //take 2 freq array
        int[] f1=new int[26];
        
        for(char ch:s1.toCharArray()){
            //add to f1 freq array
            f1[ch-'a']++;
        }
        //now we will check all substrings of length same as n
        for(int i=0;i<m-n+1;i++){
            int[] f2=new int[26];//creating a new array to check freq for each substring
            for(int j=i;j<i+n;j++){
                //travelling all characters of the substring
                f2[s2.charAt(j)-'a']++;//freq array odf substring also created
            }
            //now check both freq array
            if(Arrays.equals(f1,f2)){
                return true;
            }
        }
        return false;
    }
}
