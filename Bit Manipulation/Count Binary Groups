import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        while((n&1)==0) n>>=1;
        while(n>0){
            if((n&1)==1) n>>=1;
            else{
                count++;
                while((n&1)==0) n>>=1;}}
        System.out.print(count);}}
