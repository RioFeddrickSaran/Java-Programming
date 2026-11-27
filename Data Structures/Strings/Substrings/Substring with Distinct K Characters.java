import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        int[] arr=new int[26];
        int count=0;
        for(int i=0;i+k<=s.length();i++){
            String temp=s.substring(i,i+k);
            Arrays.fill(arr,0);
            Boolean flag=true;
                for(int j=0;j<temp.length();j++){
                    arr[temp.charAt(j)-'a']++;
                    if(arr[temp.charAt(j)-'a']>1){
                        flag=false;
                        break;}}
                if(flag) count++;}
        System.out.print(count);}}
