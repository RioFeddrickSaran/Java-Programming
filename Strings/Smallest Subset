import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        String best=null;
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp=s.substring(i,j);
                Arrays.fill(arr,0);
                for(int k=0;k<temp.length();k++){
                    arr[temp.charAt(k)-'a']++;}
                Boolean flag=true;          
                for(int k=0;k<t.length();k++){
                    arr[t.charAt(k)-'a']--;
                    if(arr[t.charAt(k)-'a']<0){
                        flag=false;
                        break;}}
                if(flag&&(best==null||best.length()>temp.length())) best=temp;}}
        System.out.print("Smallest subset : "+best);}}
