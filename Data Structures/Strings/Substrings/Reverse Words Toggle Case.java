import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int upper=0,lower=0,vowel=0;
        String[] words=s.split(" ");
        String t="";
        for(int i=0;i<words.length;i++){
            String word=words[i];
            for(int j=word.length()-1;j>=0;j--){
                char c=word.charAt(j);
                if(Character.isLowerCase(c)){
                    lower++;
                    t+=Character.toUpperCase(c);}
                else if(Character.isUpperCase(c)){
                    upper++;
                    t+=Character.toLowerCase(c);}
                if("aeiouAEIOU".indexOf(c)!=-1) vowel++;}
            if(i<words.length-1) t+=" ";}
            System.out.println("Words : "+words.length);
            System.out.println("Vowels : "+vowel);
            System.out.println("Lower : "+lower+" Upper : "+upper);
            System.out.println("Mirror : "+t);}}
