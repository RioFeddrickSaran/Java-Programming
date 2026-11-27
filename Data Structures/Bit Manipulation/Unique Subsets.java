import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        for(int i=0;i<(1<<n);i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0) list.add(arr[j]);
                set.add(list);}}
        System.out.print(set);}}
