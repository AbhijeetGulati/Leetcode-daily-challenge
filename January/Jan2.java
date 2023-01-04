
//Detect Capital
/*
 * We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
 */
public class Jan2 {
    public boolean detectCapitalUse(String word) {
        //3 cases
        int upper=0;
        int lower=0;
        boolean flag=false;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isUpperCase(c))upper++;
            else{
                lower++;
            }
            
        }
        if(upper==word.length() || lower==word.length()){
            flag=true;
        }else if((Character.isUpperCase(word.charAt(0))) && lower==word.length()-1){
            flag=true;
        }
        if(flag){
            return true;
        }
        return false;
    }
}
