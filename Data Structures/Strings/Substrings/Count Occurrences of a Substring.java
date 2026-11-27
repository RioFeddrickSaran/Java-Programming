import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        int count=0;
        for(int i=0;i+t.length()<=s.length();i++){
            if(s.startsWith(t,i)) count++;}
        System.out.println(count);}}
