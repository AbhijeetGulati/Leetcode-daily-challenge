/*
//1071 Greatest common divisor of strings
For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

  */



package February;

public class Feb1 {//using recursion
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            //then no common divisor will be there
            return "";
        }else if(str1.equals(str2)){
            return str1;//as both are equal we can return any of them
        }else if(str1.length()>str2.length()){
            //subtract str2 from str1 till common divisor is found
            return gcdOfStrings(str1.substring(str2.length()),str2);
        }else{
            //str2.length>str1.length
            return gcdOfStrings(str1,str2.substring(str1.length()));
        }
    } 
}
