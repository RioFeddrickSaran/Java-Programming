import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i]=(arr[i]<<1)|sc.nextInt();}}
        int mask=(1<<n)-1;
        for(int i=0;i<n;i++){
            int rev=0;
            for(int j=0;j<n;j++){
                rev=(rev<<1)|((arr[i]>>j)&1);}
        int ans=rev^mask;
        for(int k=n-1;k>=0;k--){
            System.out.print(((ans>>k)&1)+" ");}
        System.out.println();}}}
